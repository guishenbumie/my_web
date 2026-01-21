package com.sfm.etcd.kv;

import com.sfm.etcd.ByteSequence;
import com.sfm.etcd.KeyValue;
import com.sfm.etcd.impl.AbstractResponse;

public class PutResponse extends AbstractResponse<com.sfm.etcd.api.PutResponse> {

    private final ByteSequence namespace;

    public PutResponse(com.sfm.etcd.api.PutResponse putResponse, ByteSequence namespace) {
        super(putResponse, putResponse.getHeader());
        this.namespace = namespace;
    }

    /**
     * Returns previous key-value pair.
     *
     * @return prev kv.
     */
    public KeyValue getPrevKv() {
        return new KeyValue(getResponse().getPrevKv(), namespace);
    }

    /**
     * Returns whether a previous key-value pair is present.
     *
     * @return if has prev kv.
     */
    public boolean hasPrevKv() {
        return getResponse().hasPrevKv();
    }
}
