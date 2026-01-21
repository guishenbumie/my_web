package com.sfm.etcd.kv;

import com.sfm.etcd.ByteSequence;
import com.sfm.etcd.api.ResponseOp;
import com.sfm.etcd.impl.AbstractResponse;

import java.util.List;
import java.util.stream.Collectors;

public class TxnResponse extends AbstractResponse<com.sfm.etcd.api.TxnResponse> {

    private final ByteSequence namespace;

    private List<PutResponse> putResponses;
    private List<GetResponse> getResponses;
    private List<DeleteResponse> deleteResponses;
    private List<TxnResponse> txnResponses;

    public TxnResponse(com.sfm.etcd.api.TxnResponse txnResponse, ByteSequence namespace) {
        super(txnResponse, txnResponse.getHeader());
        this.namespace = namespace;
    }

    /**
     * Returns true if the compare evaluated to true or false otherwise.
     *
     * @return if succeeded.
     */
    public boolean isSucceeded() {
        return getResponse().getSucceeded();
    }

    /**
     * Returns a list of DeleteResponse; empty list if none.
     *
     * @return delete responses.
     */
    public synchronized List<DeleteResponse> getDeleteResponses() {
        if (deleteResponses == null) {
            deleteResponses = getResponse().getResponsesList().stream()
                    .filter((responseOp) -> responseOp.getResponseCase() == ResponseOp.ResponseCase.RESPONSE_DELETE_RANGE)
                    .map(responseOp -> new DeleteResponse(responseOp.getResponseDeleteRange(), namespace))
                    .collect(Collectors.toList());
        }

        return deleteResponses;
    }

    /**
     * Returns a list of GetResponse; empty list if none.
     *
     * @return get responses.
     */
    public synchronized List<GetResponse> getGetResponses() {
        if (getResponses == null) {
            getResponses = getResponse().getResponsesList().stream()
                    .filter((responseOp) -> responseOp.getResponseCase() == ResponseOp.ResponseCase.RESPONSE_RANGE)
                    .map(responseOp -> new GetResponse(responseOp.getResponseRange(), namespace)).collect(Collectors.toList());
        }

        return getResponses;
    }

    /**
     * Returns a list of PutResponse; empty list if none.
     *
     * @return put responses.
     */
    public synchronized List<PutResponse> getPutResponses() {
        if (putResponses == null) {
            putResponses = getResponse().getResponsesList().stream()
                    .filter((responseOp) -> responseOp.getResponseCase() == ResponseOp.ResponseCase.RESPONSE_PUT)
                    .map(responseOp -> new PutResponse(responseOp.getResponsePut(), namespace)).collect(Collectors.toList());
        }

        return putResponses;
    }

    /**
     * Returns a list of TxnResponse; empty list if none.
     *
     * @return txn responses.
     */
    public synchronized List<TxnResponse> getTxnResponses() {
        if (txnResponses == null) {
            txnResponses = getResponse().getResponsesList().stream()
                    .filter((responseOp) -> responseOp.getResponseCase() == ResponseOp.ResponseCase.RESPONSE_TXN)
                    .map(responseOp -> new TxnResponse(responseOp.getResponseTxn(), namespace)).collect(Collectors.toList());
        }

        return txnResponses;
    }
}

