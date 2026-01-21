package com.sfm.etcd.impl;

import com.google.protobuf.ByteString;
import com.sfm.etcd.ByteSequence;
import com.sfm.etcd.KV;
import com.sfm.etcd.Txn;
import com.sfm.etcd.Util;
import com.sfm.etcd.api.*;
import com.sfm.etcd.kv.CompactResponse;
import com.sfm.etcd.kv.DeleteResponse;
import com.sfm.etcd.kv.GetResponse;
import com.sfm.etcd.kv.PutResponse;
import com.sfm.etcd.kv.TxnResponse;
import com.sfm.etcd.op.TxnImpl;
import com.sfm.etcd.options.*;

import java.util.concurrent.atomic.AtomicReference;

public class KVClient extends GrpcClient implements KV {

    private final AtomicReference<KVGrpc.KVBlockingStub> blockingStub = new AtomicReference<>();
    private final ByteSequence namespace;

    public KVClient(ClientConnectionManager manager) {
        super(manager);
        updateBlockingStub();
        namespace = manager.getBuilder().namespace();
        manager.addChangeConnListener(this::updateBlockingStub);
    }

    @Override
    protected void updateBlockingStub() {
        var conn = manager.connection();
        var stub = KVGrpc.newBlockingStub(conn.channel()).withCallCredentials(conn.credential()).withDeadlineAfter(manager.getBuilder().connectTimeout());
        this.blockingStub.set(stub);
    }

    @Override
    public GetResponse get(ByteSequence key) throws Exception {
        return get(key, GetOption.DEFAULT);
    }

    @Override
    public GetResponse get(ByteSequence key, GetOption option) throws Exception {
        return executeWithFailover(() -> {
            var req = mapRangeRequest(key, option, namespace);
            var resp = blockingStub.get().range(req);
            return new GetResponse(resp, manager.getBuilder().namespace());
        });
    }

    @Override
    public PutResponse put(ByteSequence key, ByteSequence value) throws Exception {
        return put(key, value, PutOption.DEFAULT);
    }

    @Override
    public PutResponse put(ByteSequence key, ByteSequence value, PutOption option) throws Exception {
        return executeWithFailover(() -> {
            var req = mapPutRequest(key, value, option, namespace);
            var resp = blockingStub.get().put(req);
            return new PutResponse(resp, namespace);
        });
    }

    @Override
    public DeleteResponse delete(ByteSequence key) throws Exception {
        return delete(key, DeleteOption.DEFAULT);
    }

    @Override
    public DeleteResponse delete(ByteSequence key, DeleteOption option) throws Exception {
        return executeWithFailover(() -> {
            var req = mapDeleteRequest(key, option, namespace);
            var resp = blockingStub.get().deleteRange(req);
            return new DeleteResponse(resp, namespace);
        });
    }

    @Override
    public CompactResponse compact(long rev) throws Exception {
        return compact(rev, CompactOption.DEFAULT);
    }

    @Override
    public CompactResponse compact(long rev, CompactOption option) throws Exception {
        return executeWithFailover(() -> {
            var req = CompactionRequest.newBuilder()
                    .setRevision(rev)
                    .setPhysical(option.isPhysical())
                    .build();
            var resp = blockingStub.get().compact(req);
            return new CompactResponse(resp);
        });
    }

    @Override
    public Txn txn() {
        return TxnImpl.newTxn(req -> executeWithFailover(() -> {
            var resp = blockingStub.get().txn(req);
            return new TxnResponse(resp, namespace);
        }), namespace);
    }

    public static RangeRequest mapRangeRequest(ByteSequence key, GetOption option, ByteSequence namespace) {
        var builder = RangeRequest.newBuilder()
                .setKey(Util.prefixNamespace(key, namespace))
                .setCountOnly(option.isCountOnly())
                .setLimit(option.getLimit())
                .setRevision(option.getRevision())
                .setKeysOnly(option.isKeysOnly())
                .setSerializable(option.isSerializable())
                .setSortOrder(OptionsUtil.toRangeRequestSortOrder(option.getSortOrder()))
                .setSortTarget(OptionsUtil.toRangeRequestSortTarget(option.getSortField()))
                .setMinCreateRevision(option.getMinCreateRevision())
                .setMaxCreateRevision(option.getMaxCreateRevision())
                .setMinModRevision(option.getMinModRevision())
                .setMaxModRevision(option.getMaxModRevision());
        OptionsUtil.defineRangeRequestEnd(key, option.getEndKey(), option.isPrefix(), namespace, builder::setRangeEnd);
        return builder.build();
    }

    public static PutRequest mapPutRequest(ByteSequence key, ByteSequence value, PutOption option, ByteSequence namespace) {
        return PutRequest.newBuilder()
                .setKey(Util.prefixNamespace(key, namespace))
                .setValue(ByteString.copyFrom(value.getBytes()))
                .setLease(option.getLeaseId())
                .setPrevKv(option.getPrevKV())
                .build();
    }

    public static DeleteRangeRequest mapDeleteRequest(ByteSequence key, DeleteOption option, ByteSequence namespace) {
        var builder = DeleteRangeRequest.newBuilder()
                .setKey(Util.prefixNamespace(key, namespace))
                .setPrevKv(option.isPrevKV());
        OptionsUtil.defineRangeRequestEnd(key, option.getEndKey(), option.isPrefix(), namespace, builder::setRangeEnd);
        return builder.build();
    }
}
