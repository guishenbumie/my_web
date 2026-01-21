package com.sfm.etcd.op;

import com.google.common.annotations.VisibleForTesting;
import com.sfm.etcd.ByteSequence;
import com.sfm.etcd.Txn;
import com.sfm.etcd.api.TxnRequest;
import com.sfm.etcd.kv.TxnResponse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TxnImpl implements Txn {

    @FunctionalInterface
    public interface CheckedFunction<T, R> {
        R apply(T t) throws Exception;
    }

    public static TxnImpl newTxn(CheckedFunction<TxnRequest, TxnResponse> f, ByteSequence namespace) {
        return new TxnImpl(f, namespace);
    }

    @VisibleForTesting
    static TxnImpl newTxn(CheckedFunction<TxnRequest, TxnResponse> f) {
        return newTxn(f, ByteSequence.EMPTY);
    }

    private final ByteSequence namespace;

    private final List<Cmp> cmpList = new ArrayList<>();
    private final List<Op> successOpList = new ArrayList<>();
    private final List<Op> failureOpList = new ArrayList<>();
    private final CheckedFunction<TxnRequest, TxnResponse> requestF;

    private boolean seenThen = false;
    private boolean seenElse = false;

    private TxnImpl(CheckedFunction<TxnRequest, TxnResponse> f, ByteSequence namespace) {
        this.requestF = f;
        this.namespace = namespace;
    }

    @Override
    public TxnImpl If(Cmp... cmps) {
        return If(Arrays.asList(cmps));
    }

    TxnImpl If(List<Cmp> cmps) {
        if (this.seenThen) {
            throw new IllegalArgumentException("cannot call If after Then!");
        }
        if (this.seenElse) {
            throw new IllegalArgumentException("cannot call If after Else!");
        }

        cmpList.addAll(cmps);
        return this;
    }

    @Override
    public TxnImpl Then(Op... ops) {
        return Then(Arrays.asList(ops));
    }

    TxnImpl Then(List<Op> ops) {
        if (this.seenElse) {
            throw new IllegalArgumentException("cannot call Then after Else!");
        }

        this.seenThen = true;

        successOpList.addAll(ops);
        return this;
    }

    @Override
    public TxnImpl Else(Op... ops) {
        return Else(Arrays.asList(ops));
    }

    TxnImpl Else(List<Op> ops) {
        this.seenElse = true;

        failureOpList.addAll(ops);
        return this;
    }

    @Override
    public TxnResponse commit() throws Exception {
        return this.requestF.apply(this.toTxnRequest());
    }

    private TxnRequest toTxnRequest() {
        TxnRequest.Builder requestBuilder = TxnRequest.newBuilder();

        for (Cmp c : this.cmpList) {
            requestBuilder.addCompare(c.toCompare(namespace));
        }

        for (Op o : this.successOpList) {
            requestBuilder.addSuccess(o.toRequestOp(namespace));
        }

        for (Op o : this.failureOpList) {
            requestBuilder.addFailure(o.toRequestOp(namespace));
        }

        return requestBuilder.build();
    }
}