package com.sfm.etcd;

public class KeyValue {

    private final com.sfm.etcd.api.KeyValue kv;
    private final ByteSequence unprefixedKey;
    private final ByteSequence value;

    public KeyValue(com.sfm.etcd.api.KeyValue kv, ByteSequence namespace) {
        this.kv = kv;
        this.value = ByteSequence.from(kv.getValue());

        this.unprefixedKey = ByteSequence.from(
                kv.getKey().isEmpty()
                        ? kv.getKey()
                        : Util.unprefixNamespace(kv.getKey(), namespace));
    }

    /**
     * Returns the key
     *
     * @return the key.
     */
    public ByteSequence getKey() {
        return unprefixedKey;
    }

    /**
     * Returns the value
     *
     * @return the value.
     */
    public ByteSequence getValue() {
        return value;
    }

    /**
     * Returns the create revision.
     *
     * @return the create revision.
     */
    public long getCreateRevision() {
        return kv.getCreateRevision();
    }

    /**
     * Returns the mod revision.
     *
     * @return the mod revision.
     */
    public long getModRevision() {
        return kv.getModRevision();
    }

    /**
     * Returns the version.
     *
     * @return the version.
     */
    public long getVersion() {
        return kv.getVersion();
    }

    /**
     * Returns the lease.
     *
     * @return the lease.
     */
    public long getLease() {
        return kv.getLease();
    }
}

