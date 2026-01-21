package com.sfm.etcd.impl;

import com.google.common.base.Strings;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.sfm.etcd.ByteSequence;
import com.sfm.etcd.Util;
import com.sfm.etcd.Watch;
import com.sfm.etcd.api.*;
import com.sfm.etcd.options.OptionsUtil;
import com.sfm.etcd.options.WatchOption;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class WatchClient extends GrpcClient implements Watch {

    private final Object lock;
    private final AtomicReference<WatchGrpc.WatchBlockingStub> blockingStub = new AtomicReference<>();
    private final ListeningScheduledExecutorService executor;
    private final AtomicBoolean closed;
    private final List<WatcherImpl> watchers;
    private final ByteSequence namespace;

    public WatchClient(ClientConnectionManager manager) {
        super(manager);
        this.lock = new Object();
        updateBlockingStub();
        // set it to daemon as there is no way for users to create this thread pool by their own
        this.executor = MoreExecutors.listeningDecorator(
                Executors.newScheduledThreadPool(1, Util.createThreadFactory("etcd-watch-", true)));
        this.closed = new AtomicBoolean();
        this.watchers = new CopyOnWriteArrayList<>();
        namespace = manager.getBuilder().namespace();
        manager.addChangeConnListener(this::updateBlockingStub);
    }

    @Override
    protected void updateBlockingStub() {
        var conn = manager.connection();
        var stub = WatchGrpc.newBlockingStub(conn.channel()).withCallCredentials(conn.credential()).withDeadlineAfter(manager.getBuilder().connectTimeout());
        this.blockingStub.set(stub);
    }


    @Override
    public Watcher watch(ByteSequence key, WatchOption option, Listener listener) {
        if (closed.get()) {
//            throw newClosedWatchClientException();
        }

        WatcherImpl impl;

        synchronized (this.lock) {
            impl = new WatcherImpl(key, option, listener);
            impl.resume();

            watchers.add(impl);
        }

        return impl;
    }

    @Override
    public void close() {
        if (closed.compareAndSet(false, true)) {
            synchronized (this.lock) {
                executor.shutdownNow();
                watchers.forEach(Watcher::close);
            }
        }
    }

    @Override
    public void requestProgress() {
        if (!closed.get()) {
            synchronized (this.lock) {
                watchers.forEach(Watcher::requestProgress);
            }
        }
    }

    final class WatcherImpl implements Watcher {
        private final ByteSequence key;
        private final WatchOption option;
        private final Listener listener;
        private final AtomicBoolean closed;

        private final AtomicReference<StreamObserver<WatchRequest>> wstream;
        private final AtomicBoolean started;
        private long revision;
        private long id;

        WatcherImpl(ByteSequence key, WatchOption option, Listener listener) {
            this.key = key;
            this.option = option;
            this.listener = listener;
            this.closed = new AtomicBoolean();

            this.started = new AtomicBoolean();
            this.wstream = new AtomicReference<>();
            this.id = -1;
            this.revision = this.option.getRevision();
        }

        @Override
        public boolean isClosed() {
            return this.closed.get() || WatchClient.this.closed.get();
        }

        void resume() {
            if (isClosed()) {
                return;
            }

            if (started.compareAndSet(false, true)) {
                // id is not really useful today, but it may be in etcd 3.4
                id = -1;

                WatchCreateRequest.Builder builder = WatchCreateRequest.newBuilder()
                        .setKey(Util.prefixNamespace(this.key, namespace))
                        .setPrevKv(this.option.isPrevKV())
                        .setProgressNotify(option.isProgressNotify()).setStartRevision(this.revision);

                option.getEndKey()
                        .map(endKey -> Util.prefixNamespaceToRangeEnd(endKey, namespace))
                        .ifPresent(builder::setRangeEnd);

                if (option.getEndKey().isEmpty() && option.isPrefix()) {
                    ByteSequence endKey = OptionsUtil.prefixEndOf(key);
                    builder.setRangeEnd(Util.prefixNamespaceToRangeEnd(endKey, namespace));
                }

                if (option.isNoDelete()) {
                    builder.addFilters(WatchCreateRequest.FilterType.NODELETE);
                }

                if (option.isNoPut()) {
                    builder.addFilters(WatchCreateRequest.FilterType.NOPUT);
                }
                //TODO 到这了
                var responseObserver = new StreamObserver<WatchResponse>() {
                    @Override
                    public void onNext(WatchResponse response) {
                        // 处理服务端推送的响应
                        if (response.getCanceled()) {
                            // 监听被取消
                            started.set(false);
                            listener
//                            listener.onCanceled(response.getCancelReason());
                            return;
                        }

                        // 记录服务端分配的watchId（首次返回时）
                        if (id == -1) {
                            id = response.getWatchId();
                        }

                        // 解析并回调事件
                        for (Event event : response.getEventsList()) {
                            listener.onEvent(event);
                        }
                    }

                    @Override
                    public void onError(Throwable throwable) {

                    }

                    @Override
                    public void onCompleted() {

                    }
                };
            }
        }

        @Override
        public void close() {

            // sync with onError()
            synchronized (WatchClient.this.lock) {
                if (closed.compareAndSet(false, true)) {
                    // 构建「取消监听」请求
                    var cancelRequest = WatchCancelRequest.newBuilder()
                            .setWatchId(id)
                            .build();
                    var watchRequest = WatchRequest.newBuilder()
                            .setCancelRequest(cancelRequest)
                            .build();

                    id = -1;

                    // 发送取消请求 + 关闭流
                    wstream.get().onNext(watchRequest);
                    wstream.get().onCompleted();

                    // 重置状态
                    id = -1;
                    wstream.set(null);
//
//                    listener.onCompleted();
//
//                    // remote the watcher from the watchers list
//                    watchers.remove(this);
                }
            }
        }

        @Override
        public void requestProgress() {
            if (!closed.get() && wstream.get() != null) {
                WatchProgressRequest watchProgressRequest = WatchProgressRequest.newBuilder().build();
                wstream.get().onNext(WatchRequest.newBuilder().setProgressRequest(watchProgressRequest).build());
            }
        }

        // ************************
        //
        // StreamObserver
        //
        // ************************

        private void onNext(WatchResponse response) {
            if (closed.get()) {
                // events eventually received when the client is closed should
                // not be propagated to the listener
                return;
            }

            // handle a special case when watch has been created and closed at the same time
            if (response.getCreated() && response.getCanceled() && response.getCancelReason() != null
                    && (response.getCancelReason().contains("etcdserver: permission denied") ||
                    response.getCancelReason().contains("etcdserver: invalid auth token"))) {

                // potentially access token expired
                connectionManager().authCredential().refresh();
                Status error = Status.Code.CANCELLED.toStatus().withDescription(response.getCancelReason());
                handleError(toEtcdException(error), true);
            } else if (response.getCreated()) {

                //
                // Created
                //

                if (response.getWatchId() == -1) {
                    listener.onError(newEtcdException(ErrorCode.INTERNAL, "etcd server failed to create watch id"));
                    return;
                }

                revision = Math.max(revision, response.getHeader().getRevision());
                id = response.getWatchId();
                if (option.isCreatedNotify()) {
                    listener.onNext(new io.etcd.jetcd.watch.WatchResponse(response));
                }
            } else if (response.getCanceled()) {

                //
                // Cancelled
                //

                String reason = response.getCancelReason();
                Throwable error;

                if (response.getCompactRevision() != 0) {
                    error = newCompactedException(response.getCompactRevision());
                } else if (Strings.isNullOrEmpty(reason)) {
                    error = newEtcdException(ErrorCode.OUT_OF_RANGE,
                            "etcdserver: mvcc: required revision is a future revision");
                } else {
                    error = newEtcdException(ErrorCode.FAILED_PRECONDITION, reason);
                }

                handleError(toEtcdException(error), false);
            } else if (io.etcd.jetcd.watch.WatchResponse.isProgressNotify(response)) {
                listener.onNext(new io.etcd.jetcd.watch.WatchResponse(response));
                revision = Math.max(revision, response.getHeader().getRevision());
            } else if (response.getEventsCount() == 0 && option.isProgressNotify()) {

                //
                // Event
                //
                // A response may not contain events, this is in case of "Progress_Notify":
                //
                //   the watch will periodically receive a  WatchResponse with no events,
                //   if there are no recent events. It is useful when clients wish to
                //   recover a disconnected watcher starting from a recent known revision.
                //
                //   The etcd server decides how often to send notifications based on current
                //   server load.
                //
                // For more info:
                //   https://coreos.com/etcd/docs/latest/learning/api.html#watch-streams
                //
                listener.onNext(new io.etcd.jetcd.watch.WatchResponse(response, namespace));
                revision = response.getHeader().getRevision();
            } else if (response.getEventsCount() > 0) {
                listener.onNext(new io.etcd.jetcd.watch.WatchResponse(response, namespace));
                revision = response.getEvents(response.getEventsCount() - 1).getKv().getModRevision() + 1;
            }
        }

        private void onCompleted() {
            listener.onCompleted();
        }

        private void onError(Throwable t) {
            handleError(toEtcdException(t), shouldReschedule(Status.fromThrowable(t)));
        }

        private void handleError(EtcdException etcdException, boolean shouldReschedule) {
            // sync with close()
            synchronized (WatchClient.this.lock) {
                if (isClosed()) {
                    return;
                }

                listener.onError(etcdException);
                if (wstream.get() != null) {
                    wstream.get().end();
                }
                wstream.set(null);
                started.set(false);
            }
            if (shouldReschedule) {
                if (etcdException.getMessage().contains("etcdserver: permission denied")) {
                    // potentially access token expired
                    connectionManager().authCredential().refresh();
                }

                reschedule();
                return;
            }
            close();
        }

        private boolean shouldReschedule(final Status status) {
            return !Errors.isHaltError(status) && !Errors.isNoLeaderError(status);
        }

        private void reschedule() {
            Futures.addCallback(executor.schedule(this::resume, 500, TimeUnit.MILLISECONDS), new FutureCallback<Object>() {
                @Override
                public void onFailure(Throwable t) {
                    LOG.warn("scheduled resume failed", t);
                }

                @Override
                public void onSuccess(Object result) {
                }
            }, executor);
        }
    }
