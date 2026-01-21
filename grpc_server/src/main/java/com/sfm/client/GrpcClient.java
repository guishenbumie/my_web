package com.sfm.client;

import com.sfm.grpc.UserRequest;
import com.sfm.grpc.UserServiceGrpc;
import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import java.util.concurrent.TimeUnit;

public class GrpcClient {
    private final UserServiceGrpc.UserServiceBlockingStub blockingStub;

    public GrpcClient(Channel channel) {
        blockingStub = UserServiceGrpc.newBlockingStub(channel);
    }

    public void getUser(int userId) {
        System.out.println("Querying user ID: " + userId);
        UserRequest request = UserRequest.newBuilder().setUserId(userId).build();

        try {
            var response = blockingStub.getUserById(request);
            System.out.printf("User Info: ID=%d, Name=%s, Age=%d, Email=%s%n",
                    response.getUserId(),
                    response.getName(),
                    response.getAge(),
                    response.getEmail());
        } catch (Exception e) {
            System.err.println("RPC failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        String host = "localhost";
        int port = 10011;

        // 创建非加密通道
        ManagedChannel channel = Grpc.newChannelBuilderForAddress(host, port, InsecureChannelCredentials.create())
                .build();
        try {
            GrpcClient client = new GrpcClient(channel);
            client.getUser(1);   // 存在的用户
            client.getUser(99);  // 不存在的用户
        } finally {
            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
