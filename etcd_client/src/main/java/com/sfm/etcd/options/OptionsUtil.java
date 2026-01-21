package com.sfm.etcd.options;

import com.google.protobuf.ByteString;
import com.sfm.etcd.ByteSequence;
import com.sfm.etcd.Util;
import com.sfm.etcd.api.RangeRequest;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Consumer;

public final class OptionsUtil {
    private static final byte[] NO_PREFIX_END = { 0 };

    private OptionsUtil() {
    }
    /**
     * Gets the range end of the given prefix.
     *
     * <p>
     * The range end is the key plus one (e.g., "aa"+1 == "ab", "a\xff"+1 == "b").
     *
     * @param  prefix the given prefix
     * @return        the range end of the given prefix
     */
    public static ByteSequence prefixEndOf(ByteSequence prefix) {
        byte[] endKey = prefix.getBytes().clone();
        for (int i = endKey.length - 1; i >= 0; i--) {
            if (endKey[i] != (byte) 0xff) {
                endKey[i] = (byte) (endKey[i] + 1);
                return ByteSequence.from(Arrays.copyOf(endKey, i + 1));
            }
        }

        return ByteSequence.from(NO_PREFIX_END);
    }


    /**
     * convert client SortOrder to apu SortOrder.
     *
     * @param  order the order
     * @return       the translated {@link RangeRequest.SortOrder}
     */
    public static RangeRequest.SortOrder toRangeRequestSortOrder(GetOption.SortOrder order) {
        return switch (order) {
            case NONE -> RangeRequest.SortOrder.NONE;
            case ASCEND -> RangeRequest.SortOrder.ASCEND;
            case DESCEND -> RangeRequest.SortOrder.DESCEND;
//            default -> RangeRequest.SortOrder.UNRECOGNIZED;
        };
    }

    /**
     * convert client SortTarget to apu SortTarget.
     *
     * @param  target the target
     * @return        the translated {@link RangeRequest.SortTarget}
     */
    public static RangeRequest.SortTarget toRangeRequestSortTarget(GetOption.SortTarget target) {
        return switch (target) {
            case KEY -> RangeRequest.SortTarget.KEY;
            case CREATE -> RangeRequest.SortTarget.CREATE;
            case MOD -> RangeRequest.SortTarget.MOD;
            case VALUE -> RangeRequest.SortTarget.VALUE;
            case VERSION -> RangeRequest.SortTarget.VERSION;
//            default -> RangeRequest.SortTarget.UNRECOGNIZED;
        };
    }

    public static void defineRangeRequestEnd(
            ByteSequence key,
            Optional<ByteSequence> endKeyOptional,
            boolean hasPrefix,
            ByteSequence namespace,
            Consumer<ByteString> setRangeEndConsumer) {

        if (endKeyOptional.isPresent()) {
            setRangeEndConsumer
                    .accept(Util.prefixNamespaceToRangeEnd(ByteString.copyFrom(endKeyOptional.get().getBytes()), namespace));
        } else {
            if (hasPrefix) {
                ByteSequence endKey = OptionsUtil.prefixEndOf(key);
                setRangeEndConsumer.accept(Util.prefixNamespaceToRangeEnd(ByteString.copyFrom(endKey.getBytes()), namespace));
            }
        }
    }
}
