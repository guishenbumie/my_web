package com.sfm.etcd.options;

import com.sfm.etcd.ByteSequence;

import java.util.Optional;

import static java.util.Objects.requireNonNull;

public final class DeleteOption {
    public static final DeleteOption DEFAULT = builder().build();

    private final ByteSequence endKey;
    private final boolean prevKV;
    private final boolean prefix;

    private DeleteOption(ByteSequence endKey, boolean prevKV, boolean prefix) {
        this.endKey = endKey;
        this.prevKV = prevKV;
        this.prefix = prefix;
    }

    public Optional<ByteSequence> getEndKey() {
        return Optional.ofNullable(endKey);
    }

    /**
     * Whether to get the previous key/value pairs before deleting them.
     *
     * @return true if get the previous key/value pairs before deleting them, otherwise false.
     */
    public boolean isPrevKV() {
        return prevKV;
    }

    /**
     * Whether to treat this deletion as deletion by prefix
     *
     * @return true if deletion by prefix.
     */
    public boolean isPrefix() {
        return prefix;
    }

    /**
     * Returns the builder.
     *
     * @deprecated use {@link #builder()}
     * @return     the builder
     */
    @SuppressWarnings("InlineMeSuggester")
    @Deprecated
    public static Builder newBuilder() {
        return builder();
    }

    /**
     * Returns the builder.
     *
     * @return the builder
     */
    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private ByteSequence endKey;
        private boolean prevKV = false;
        private boolean prefix = false;
        private boolean autoRetry = false;

        private Builder() {
        }

        /**
         * Set the end key of the delete request. If it is set, the delete request will delete the keys
         * from <i>key</i> to <i>endKey</i> (exclusive).
         *
         * <p>
         * If end key is '\0', the range is all keys {@literal >=}
         * key.
         *
         * <p>
         * If the end key is one bit larger than the given key, then it deletes all keys with
         * the prefix (the given key).
         *
         * <p>
         * If both key and end key are '\0', it deletes all keys.
         *
         * @param  endKey end key
         * @return        builder
         */
        public Builder withRange(ByteSequence endKey) {
            this.endKey = endKey;
            return this;
        }

        /**
         * Enables 'Delete' requests to delete all the keys by prefix.
         *
         * <p>
         *
         * @param  prefix flag to delete all the keys by prefix
         * @return        builder
         */
        public DeleteOption.Builder isPrefix(boolean prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Enables 'Delete' requests to delete all the keys with matching prefix.
         *
         * <p>
         * You should pass the key that is passed into method
         * into this method as the given key.
         *
         * @param      prefix the common prefix of all the keys that you want to delete
         * @return            builder
         * @deprecated        Use {@link #isPrefix(boolean)} instead.
         */
        @Deprecated
        public Builder withPrefix(ByteSequence prefix) {
            requireNonNull(prefix, "prefix should not be null");
            ByteSequence prefixEnd = OptionsUtil.prefixEndOf(prefix);
            this.withRange(prefixEnd);
            return this;
        }

        /**
         * Get the previous key/value pairs before deleting them.
         *
         * @param  prevKV flag to get previous key/value pairs before deleting them.
         * @return        builder
         */
        public Builder withPrevKV(boolean prevKV) {
            this.prevKV = prevKV;
            return this;
        }

        public DeleteOption build() {
            return new DeleteOption(endKey, prevKV, prefix);
        }

    }
}
