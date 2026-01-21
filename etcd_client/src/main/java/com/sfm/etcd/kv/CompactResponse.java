package com.sfm.etcd.kv;

import com.sfm.etcd.api.CompactionResponse;
import com.sfm.etcd.impl.AbstractResponse;

public class CompactResponse extends AbstractResponse<CompactionResponse> {

    public CompactResponse(CompactionResponse response) {
        super(response, response.getHeader());
    }
}
