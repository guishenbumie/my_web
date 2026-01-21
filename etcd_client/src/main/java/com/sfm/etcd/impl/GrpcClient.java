package com.sfm.etcd.impl;

import com.sfm.etcd.Util;
import io.grpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class GrpcClient implements AutoCloseable {
    protected final Logger logger;
    protected final ClientConnectionManager manager;

    protected GrpcClient(ClientConnectionManager manager) {
        this.manager = manager;
        this.logger = LoggerFactory.getLogger(this.getClass());
    }

    protected abstract void updateBlockingStub();

    @Override
    public void close() {
        // noop
    }

    @FunctionalInterface
    protected interface GrpcOperation<T> {
        T execute() throws Exception;
    }

    // 带故障转移的通用执行方法
    protected <T> T executeWithFailover(GrpcOperation<T> operation) throws Exception {
        int retryCount = 0;
        int maxRetries = 3; // 最大重试次数

        while (retryCount < maxRetries) {
            try {
                return operation.execute(); // 执行操作
            } catch (StatusRuntimeException e) {
                retryCount++;
                logger.error("etcd operation failed, count={}, err_status={}", retryCount, e.getStatus());

                if (Util.isConnectionError(e.getStatus().getCode()) || retryCount >= maxRetries) {// 若为连接错误（如节点宕机），切换节点
                    manager.switchConnection();
                } else if (e.getStatus().getCode() == Status.Code.UNAUTHENTICATED) {// token过期或者无效，重新获取一个token
                    manager.refreshToken();
                }
            }
        }
        throw new Exception("retry operation failed");
    }
}
