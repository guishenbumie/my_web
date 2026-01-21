package com.sfm.etcd.impl;

import com.sfm.etcd.ClientBuilder;
import com.sfm.etcd.api.AuthGrpc;
import com.sfm.etcd.api.AuthenticateRequest;
import com.sfm.etcd.api.AuthenticateResponse;
import io.grpc.CallCredentials;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.StatusRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executor;

public class AuthCredential extends CallCredentials {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static final Metadata.Key<String> TOKEN;
    private final ClientBuilder builder;
    private final ManagedChannel channel;
    private volatile Metadata meta;

    public AuthCredential(ClientBuilder builder, ManagedChannel channel) {
        this.builder = builder;
        this.channel = channel;
    }

    @Override
    public void applyRequestMetadata(RequestInfo requestInfo, Executor executor, MetadataApplier metadataApplier) {
        executor.execute(() -> {
            Metadata meta = this.meta;
            if (meta != null) {
                metadataApplier.apply(meta);
            } else {
                try {
                    this.authenticate(metadataApplier);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    // 认证请求
    private void authenticate(CallCredentials.MetadataApplier applier) throws Exception {
        AuthGrpc.AuthBlockingStub blockingStub = AuthGrpc.newBlockingStub(channel).withDeadlineAfter(builder.connectTimeout());
        AuthenticateRequest authRequest = AuthenticateRequest.newBuilder().setName(builder.username()).setPassword(builder.password()).build();
        try {
            AuthenticateResponse authResponse = blockingStub.authenticate(authRequest);
            Metadata meta = new Metadata();
            var token = authResponse.getToken();
            logger.info("authenticate token={}", token);
            meta.put(TOKEN, token);
            this.meta = meta;
            applier.apply(this.meta);
        } catch (StatusRuntimeException e) {
            throw new Exception("AuthenticateRequest fail: " + e.getStatus().getDescription(), e);
        }
    }

    public void refresh() {
        this.meta = null;
    }

    static {
        TOKEN = Metadata.Key.of("token", Metadata.ASCII_STRING_MARSHALLER);
    }
}
