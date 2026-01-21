package com.sfm.etcd;

import com.google.protobuf.ByteString;
import io.grpc.Status;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Util {
    public static final ByteSequence NULL_KEY = ByteSequence.from(new byte[] { '\0' });

    public static ByteString prefixNamespace(ByteSequence key, ByteSequence namespace) {
        return ByteString.copyFrom(namespace.isEmpty() ? key.getBytes() : namespace.concat(key).getBytes());
    }

    public static ByteString prefixNamespace(ByteString key, ByteSequence namespace) {
        return namespace.isEmpty() ? key : ByteString.copyFrom(namespace.concat(key).getBytes());
    }

    public static ByteString prefixNamespaceToRangeEnd(ByteSequence end, ByteSequence namespace) {
        if (namespace.isEmpty()) {
            return ByteString.copyFrom(end.getBytes());
        }

        if (end.size() == 1 && end.getBytes()[0] == 0) {
            // range end is '\0', calculate the prefixed range end by (key + 1)
            byte[] prefixedEndArray = namespace.getBytes();
            boolean ok = false;
            for (int i = prefixedEndArray.length - 1; i >= 0; i--) {
                prefixedEndArray[i] = (byte) (prefixedEndArray[i] + 1);
                if (prefixedEndArray[i] != 0) {
                    ok = true;
                    break;
                }
            }
            if (!ok) {
                // 0xff..ff => 0x00
                prefixedEndArray = NULL_KEY.getBytes();
            }
            return ByteString.copyFrom(prefixedEndArray);
        } else {
            return ByteString.copyFrom(namespace.concat(end).getBytes());
        }
    }

    public static ByteString prefixNamespaceToRangeEnd(ByteString end, ByteSequence namespace) {
        if (namespace.isEmpty()) {
            return end;
        }

        if (end.size() == 1 && end.toByteArray()[0] == 0) {
            // range end is '\0', calculate the prefixed range end by (key + 1)
            byte[] prefixedEndArray = namespace.getBytes();
            boolean ok = false;
            for (int i = prefixedEndArray.length - 1; i >= 0; i--) {
                prefixedEndArray[i] = (byte) (prefixedEndArray[i] + 1);
                if (prefixedEndArray[i] != 0) {
                    ok = true;
                    break;
                }
            }
            if (!ok) {
                // 0xff..ff => 0x00
                prefixedEndArray = NULL_KEY.getBytes();
            }
            return ByteString.copyFrom(prefixedEndArray);
        } else {
            return ByteString.copyFrom(namespace.concat(end).getBytes());
        }
    }

    public static ByteString unprefixNamespace(ByteString key, ByteSequence namespace) {
        return namespace.isEmpty() ? key : key.substring(namespace.size());
    }

    // 判断是否为连接错误
    public static boolean isConnectionError(Status.Code code) {
        return code == Status.Code.UNAVAILABLE    // 连接不可用
                || code == Status.Code.DEADLINE_EXCEEDED  // 超时
                || code == Status.Code.CANCELLED;         // 连接被取消
    }

    public static ThreadFactory createThreadFactory(String prefix, boolean daemon) {
        ThreadFactory backingThreadFactory = Executors.defaultThreadFactory();

        return r -> {
            Thread t = backingThreadFactory.newThread(r);
            t.setDaemon(daemon);
            // set a proper name so it is easier to find out the where the thread was created
            t.setName(prefix + t.getName());
            return t;
        };
    }
}
