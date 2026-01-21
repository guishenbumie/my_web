package com.sfm.etcd.kv;

import com.sfm.etcd.ByteSequence;
import com.sfm.etcd.KeyValue;
import com.sfm.etcd.api.RangeResponse;
import com.sfm.etcd.impl.AbstractResponse;

import java.util.List;
import java.util.stream.Collectors;

public class GetResponse extends AbstractResponse<RangeResponse> {
    private final ByteSequence namespace;

    private List<KeyValue> kvs;

    public GetResponse(RangeResponse rangeResponse, ByteSequence namespace) {
        super(rangeResponse, rangeResponse.getHeader());
        this.namespace = namespace;
    }

    /**
     * Returns a list of key-value pairs matched by the range request.
     *
     * @return kvs.
     */
    public synchronized List<KeyValue> getKvs() {
        if (kvs == null) {
            kvs = getResponse().getKvsList().stream().map(kv -> new KeyValue(kv, namespace)).collect(Collectors.toList());
        }

        return kvs;
    }

    /**
     * Returns if there are more keys to return in the requested range.
     *
     * @return more.
     */
    public boolean isMore() {
        return getResponse().getMore();
    }

    /**
     * Returns the number of keys within the range requested.
     * Note this value is never affected by filtering options (limit, min or max created or modified revisions)
     * Count is the count for keys on the range part of a request.
     * Filters for limit and created or modified revision ranges restrict the
     * returned KVs, but not the count.
     *
     * @return count.
     */
    public long getCount() {
        return getResponse().getCount();
    }
}
