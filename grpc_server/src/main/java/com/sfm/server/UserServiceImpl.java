package com.sfm.server;

import com.sfm.grpc.UserRequest;
import com.sfm.grpc.UserResponse;
import com.sfm.grpc.UserServiceGrpc;
import io.grpc.stub.StreamObserver;

public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {
    @Override
    public void getUserById(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        int userId = request.getUserId();

        // 模拟数据库查询
        UserResponse response = switch (userId) {
            case 1 -> UserResponse.newBuilder()
                    .setUserId(1)
                    .setName("Alice")
                    .setAge(25)
                    .setEmail("alice@example.com")
                    .build();
            case 2 -> UserResponse.newBuilder()
                    .setUserId(2)
                    .setName("Bob")
                    .setAge(30)
                    .setEmail("bob@example.com")
                    .build();
            default -> UserResponse.newBuilder()
                    .setUserId(userId)
                    .setName("Unknown")
                    .build();
        };

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
