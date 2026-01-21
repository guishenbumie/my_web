package com.sfm.etcd.kv;

import com.sfm.etcd.ByteSequence;
import com.sfm.etcd.KeyValue;
import com.sfm.etcd.api.DeleteRangeResponse;
import com.sfm.etcd.impl.AbstractResponse;

import java.util.List;
import java.util.stream.Collectors;

public class DeleteResponse extends AbstractResponse<DeleteRangeResponse> {

    private final ByteSequence namespace;

    private List<KeyValue> prevKvs;

    public DeleteResponse(DeleteRangeResponse deleteRangeResponse, ByteSequence namespace) {
        super(deleteRangeResponse, deleteRangeResponse.getHeader());
        this.namespace = namespace;
    }

    /**
     * Returns the number of keys deleted by the delete range request.
     *
     * @return number of deleted items.
     */
    public long getDeleted() {
        return getResponse().getDeleted();
    }

    /**
     * Returns previous key-value pairs.
     *
     * @return previous kv,
     */
    public synchronized List<KeyValue> getPrevKvs() {
        if (prevKvs == null) {
            prevKvs = getResponse().getPrevKvsList().stream().map(kv -> new KeyValue(kv, namespace))
                    .collect(Collectors.toList());
        }

        return prevKvs;
    }
}
