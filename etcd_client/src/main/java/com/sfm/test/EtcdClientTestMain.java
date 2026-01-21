package com.sfm.test;

import com.google.protobuf.ByteString;
import com.sfm.etcd.api.*;
import io.grpc.*;
import io.grpc.netty.NettyChannelBuilder;

import java.util.concurrent.TimeUnit;

public class EtcdClientTestMain {
    private final static String Host = "10.95.129.198";
    private final static int Port = 2379;
    private final static String Username = "root";
    private final static String Password = "FVcH8JPHUsk9VmJc";

    public static void main(String[] args) throws Exception {
        // 1. 创建基础通道（非加密，生产环境建议用 TLS）
        ManagedChannel baseChannel = Grpc.newChannelBuilderForAddress(Host, Port, InsecureChannelCredentials.create()).build();
//        var target = "ip:///10.95.129.198:2369,10.95.129.198:2379,10.95.129.198:2389";
//        ManagedChannel baseChannel = NettyChannelBuilder.forTarget(target, InsecureChannelCredentials.create()).idleTimeout(5, TimeUnit.SECONDS).build();
        // 2. 先通过 Auth 服务获取 token
        AuthGrpc.AuthBlockingStub authStub = AuthGrpc.newBlockingStub(baseChannel);
        AuthenticateRequest authRequest = AuthenticateRequest.newBuilder().setName(Username).setPassword(Password).build();

//        String authToken = "UdHGPJXfJLmvqFVg.239548";
        String authToken;
        try {
            // 发送认证请求
            AuthenticateResponse authResponse = authStub.authenticate(authRequest);
            authToken = authResponse.getToken(); // 获取 token
            System.out.println("AuthenticateResponse token: " + authToken);
        } catch (StatusRuntimeException e) {
            throw new Exception("AuthenticateRequest fail: " + e.getStatus().getDescription(), e);
        }

        // 3. 为通道添加拦截器，生成带认证的通道
        ClientInterceptor authTokenInterceptor = createAuthTokenInterceptor(authToken);
        Channel authChannel = ClientInterceptors.intercept(baseChannel, authTokenInterceptor);

        KVGrpc.KVBlockingStub blockingStub = KVGrpc.newBlockingStub(authChannel);
        ByteString key = ByteString.copyFromUtf8("key");
        RangeResponse response = blockingStub.range(RangeRequest.newBuilder().setKey(key).build());
        System.out.println(response);


    }

    // 创建 Basic Auth 拦截器
    private static ClientInterceptor createAuthTokenInterceptor(String authToken) {
        // 3. 创建带认证 token 的拦截器（所有请求附加 token）
        // 创建包含 token 的头部（etcd 要求用 "authorization" 头部，值为 "Bearer <token>"）
        // 附加头部到请求
        return new ClientInterceptor() {
            @Override
            public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
                    MethodDescriptor<ReqT, RespT> method,
                    CallOptions callOptions,
                    Channel next) {

                // 创建包含 token 的头部（etcd 要求用 "authorization" 头部，值为 "Bearer <token>"）
                Metadata authHeaders = new Metadata();
                Metadata.Key<String> authKey = Metadata.Key.of(
                        "token",
                        Metadata.ASCII_STRING_MARSHALLER
                );
                authHeaders.put(authKey, authToken);

                // 附加头部到请求
                return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(
                        next.newCall(method, callOptions)
                ) {
                    @Override
                    public void start(Listener<RespT> responseListener, Metadata headers) {
                        headers.merge(authHeaders);
                        super.start(responseListener, headers);
                    }
                };
            }
        };
    }
}
