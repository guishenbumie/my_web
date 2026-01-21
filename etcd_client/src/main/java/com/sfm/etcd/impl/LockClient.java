package com.sfm.etcd.impl;

public class LockClient extends GrpcClient {
    public LockClient(ClientConnectionManager manager) {
        super(manager);
    }

    @Override
    protected void updateBlockingStub() {

    }
}
