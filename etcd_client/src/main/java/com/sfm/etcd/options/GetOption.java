package com.sfm.etcd.options;

import com.google.protobuf.ByteString;
import com.sfm.etcd.ByteSequence;

import java.util.Optional;

public final class GetOption {
    public static final GetOption DEFAULT = builder().build();
    private final ByteSequence endKey;
    private final long limit;
    private final long revision;
    private final SortOrder sortOrder;
    private final SortTarget sortTarget;
    private final boolean serializable;
    private final boolean keysOnly;
    private final boolean countOnly;
    private final long minCreateRevision;
    private final long maxCreateRevision;
    private final long minModRevision;
    private final long maxModRevision;
    private final boolean prefix;

    private GetOption(ByteSequence endKey, long limit, long revision, SortOrder sortOrder, SortTarget sortTarget, boolean serializable, boolean keysOnly, boolean countOnly, long minCreateRevision, long maxCreateRevision, long minModRevision, long maxModRevision, boolean prefix) {
        this.endKey = endKey;
        this.limit = limit;
        this.revision = revision;
        this.sortOrder = sortOrder;
        this.sortTarget = sortTarget;
        this.serializable = serializable;
        this.keysOnly = keysOnly;
        this.countOnly = countOnly;
        this.minCreateRevision = minCreateRevision;
        this.maxCreateRevision = maxCreateRevision;
        this.minModRevision = minModRevision;
        this.maxModRevision = maxModRevision;
        this.prefix = prefix;
    }

    public long getLimit() {
        return this.limit;
    }

    public Optional<ByteSequence> getEndKey() {
        return Optional.ofNullable(this.endKey);
    }

    public long getRevision() {
        return this.revision;
    }

    public SortOrder getSortOrder() {
        return this.sortOrder;
    }

    public SortTarget getSortField() {
        return this.sortTarget;
    }

    public boolean isSerializable() {
        return this.serializable;
    }

    public boolean isKeysOnly() {
        return this.keysOnly;
    }

    public boolean isCountOnly() {
        return this.countOnly;
    }

    public long getMinCreateRevision() {
        return this.minCreateRevision;
    }

    public long getMaxCreateRevision() {
        return this.maxCreateRevision;
    }

    public long getMinModRevision() {
        return this.minModRevision;
    }

    public long getMaxModRevision() {
        return this.maxModRevision;
    }

    public boolean isPrefix() {
        return this.prefix;
    }

    /** @deprecated */
    @Deprecated
    public static Builder newBuilder() {
        return builder();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static enum SortOrder {
        NONE,
        ASCEND,
        DESCEND;

        private SortOrder() {
        }
    }

    public static enum SortTarget {
        KEY,
        VERSION,
        CREATE,
        MOD,
        VALUE;

        private SortTarget() {
        }
    }

    public static final class Builder {
        private long limit = 0L;
        private long revision = 0L;
        private SortOrder sortOrder;
        private SortTarget sortTarget;
        private boolean serializable;
        private boolean keysOnly;
        private boolean countOnly;
        private ByteSequence endKey;
        private long minCreateRevision;
        private long maxCreateRevision;
        private long minModRevision;
        private long maxModRevision;
        private boolean prefix;

        private Builder() {
            this.sortOrder = GetOption.SortOrder.NONE;
            this.sortTarget = GetOption.SortTarget.KEY;
            this.serializable = false;
            this.keysOnly = false;
            this.countOnly = false;
            this.minCreateRevision = 0L;
            this.maxCreateRevision = 0L;
            this.minModRevision = 0L;
            this.maxModRevision = 0L;
            this.prefix = false;
        }

        public Builder withLimit(long limit) {
            this.limit = limit;
            return this;
        }

        public Builder withRevision(long revision) {
            this.revision = revision;
            return this;
        }

        public Builder withSortOrder(SortOrder order) {
            this.sortOrder = order;
            return this;
        }

        public Builder withSortField(SortTarget field) {
            this.sortTarget = field;
            return this;
        }

        public Builder withSerializable(boolean serializable) {
            this.serializable = serializable;
            return this;
        }

        public Builder withKeysOnly(boolean keysOnly) {
            this.keysOnly = keysOnly;
            return this;
        }

        public Builder withCountOnly(boolean countOnly) {
            this.countOnly = countOnly;
            return this;
        }

        public Builder withRange(ByteSequence endKey) {
            this.endKey = endKey;
            return this;
        }

        public Builder isPrefix(boolean prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder withMinCreateRevision(long createRevision) {
            this.minCreateRevision = createRevision;
            return this;
        }

        public Builder withMaxCreateRevision(long createRevision) {
            this.maxCreateRevision = createRevision;
            return this;
        }

        public Builder withMinModRevision(long modRevision) {
            this.minModRevision = modRevision;
            return this;
        }

        public Builder withMaxModRevision(long modRevision) {
            this.maxModRevision = modRevision;
            return this;
        }

        public GetOption build() {
            return new GetOption(this.endKey, this.limit, this.revision, this.sortOrder, this.sortTarget, this.serializable, this.keysOnly, this.countOnly, this.minCreateRevision, this.maxCreateRevision, this.minModRevision, this.maxModRevision, this.prefix);
        }
    }
}
