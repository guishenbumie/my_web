package com.sfm.etcd;

import com.sfm.etcd.kv.*;
import com.sfm.etcd.options.*;

/**
 * Interface of kv client talking to etcd.
 */
public interface KV {

    /**
     * put a key-value pair into etcd.
     *
     * @param  key   key in ByteSequence
     * @param  value value in ByteSequence
     * @return       PutResponse
     */
    PutResponse put(ByteSequence key, ByteSequence value) throws Exception;

    /**
     * put a key-value pair into etcd with option.
     *
     * @param  key    key in ByteSequence
     * @param  value  value in ByteSequence
     * @param  option PutOption
     * @return        PutResponse
     */
    PutResponse put(ByteSequence key, ByteSequence value, PutOption option) throws Exception;

    /**
     * retrieve value for the given key.
     *
     * @param  key key in ByteSequence
     * @return     GetResponse
     */
    GetResponse get(ByteSequence key) throws Exception;

    /**
     * retrieve keys with GetOption.
     *
     * @param  key    key in ByteSequence
     * @param  option GetOption
     * @return        GetResponse
     */
    GetResponse get(ByteSequence key, GetOption option) throws Exception;

    /**
     * delete a key.
     *
     * @param  key key in ByteSequence
     * @return     DeleteResponse
     */
    DeleteResponse delete(ByteSequence key) throws Exception;

    /**
     * delete a key or range with option.
     *
     * @param  key    key in ByteSequence
     * @param  option DeleteOption
     * @return        DeleteResponse
     */
    DeleteResponse delete(ByteSequence key, DeleteOption option) throws Exception;

    /**
     * compact etcd KV history before the given rev.
     *
     * <p>
     * All superseded keys with a revision less than the compaction revision will be removed.
     *
     * @param  rev the revision to compact.
     * @return     CompactResponse
     */
    CompactResponse compact(long rev) throws Exception;

    /**
     * compact etcd KV history before the given rev with option.
     *
     * <p>
     * All superseded keys with a revision less than the compaction revision will be removed.
     *
     * @param  rev    etcd revision
     * @param  option CompactOption
     * @return        CompactResponse
     */
    CompactResponse compact(long rev, CompactOption option) throws Exception;

    /**
     * creates a transaction.
     *
     * @return a Txn
     */
    Txn txn();
}
