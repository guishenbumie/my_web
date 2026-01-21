package com.sfm.etcd.impl;

import com.sfm.etcd.ClientBuilder;
import com.sfm.etcd.api.*;
import io.grpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class ClientConnectionManager {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ClientBuilder builder;// 初始的设置
    private final Set<URI> clusterEndpoints = new CopyOnWriteArraySet<>();// 集群所有成员端点（动态发现）
    private final AtomicReference<Connection> conn = new AtomicReference<>();
    private final List<Runnable> changeConnListeners = new ArrayList<>();

    public ClientConnectionManager(ClientBuilder builder) throws Exception {
        this.builder = builder.copy();
        clusterEndpoints.addAll(builder.endpoints());
        var selected = selectAvailableChannel();
        if (selected == null) {
            throw new Exception("all endpoints fail: " + builder.endpoints());
        }
        conn.set(selected);
    }

    public ClientBuilder getBuilder() {
        return builder;
    }

    public Connection connection() {
        return conn.get();
    }

    public void addChangeConnListener(Runnable listener) {
        synchronized (changeConnListeners) {
            changeConnListeners.add(listener);
        }
    }

    //检查节点是否健康
    private boolean isChannelAvailable(ManagedChannel channel, AuthCredential credential) {
        try {
            // 调用 etcd 的 "Status" 接口检查健康状态（非阻塞，带超时）
            MaintenanceGrpc.MaintenanceBlockingStub blockingStub = MaintenanceGrpc.newBlockingStub(channel).withCallCredentials(credential).withDeadlineAfter(builder.connectTimeout());
            blockingStub.status(StatusRequest.newBuilder().build());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // 从端点列表中选择第一个可用节点（测试连接是否有效）
    private Connection selectAvailableChannel() {
        for (URI endpoint : builder.endpoints()) {
            if (connection() != null && connection().uri().equals(endpoint))
                continue;
            // 尝试连接该端点
            ManagedChannel channel = Grpc.newChannelBuilderForAddress(endpoint.getHost(), endpoint.getPort(), InsecureChannelCredentials.create())
                    .idleTimeout(builder.connectTimeout().getSeconds(), TimeUnit.SECONDS)
                    .build();

            // 认证（获取 token）
            AuthCredential credential = new AuthCredential(this.builder, channel);
            if (isChannelAvailable(channel, credential)) {
                return new Connection(endpoint, channel, credential);
            } else {
                channel.shutdown(); // 连接失败，关闭通道
            }
        }
        return null;
    }

    public void mergeClusterEndpoints(Set<URI> clusterEndpoints) {
        this.clusterEndpoints.addAll(clusterEndpoints);
        logger.info("clusterEndpoints: {}", this.clusterEndpoints);
    }

    public void switchConnection() throws Exception {
        var selected = selectAvailableChannel();
        if (selected == null) {
            throw new Exception("all endpoints fail: " + builder.endpoints());
        }
        var oldConn = conn.getAndSet(selected);
        if (oldConn != null)
            oldConn.channel().shutdown();
        synchronized (changeConnListeners) {
            changeConnListeners.forEach(Runnable::run);
        }
    }

    public void refreshToken() throws Exception {
        var connection = connection();
        if (connection == null)
            throw new Exception("no connection");
        var credential = connection.credential();
        if (credential == null)
            throw new Exception("no credential");
        credential.refresh();
    }

}
