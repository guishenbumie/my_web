package com.sfm.etcd.options;

public final class CompactOption {
    public static final CompactOption DEFAULT = builder().build();

    private final boolean physical;

    private CompactOption(boolean physical) {
        this.physical = physical;
    }

    public boolean isPhysical() {
        return physical;
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

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private boolean physical = false;

        private Builder() {
        }

        /**
         * make compact RPC call wait until
         * the compaction is physically applied to the local database
         * such that compacted entries are totally removed from the
         * backend database.
         *
         * @param  physical whether the compact should wait until physically applied
         * @return          builder
         */
        public Builder withCompactPhysical(boolean physical) {
            this.physical = physical;
            return this;
        }

        public CompactOption build() {
            return new CompactOption(this.physical);
        }
    }
}