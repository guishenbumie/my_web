package sfm.web;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;

public class MsgCodec {
    public static final int MSG_CS_HEARTBEAT = 11;
    public static final int MSG_SC_HEARTBEAT = 12;
    public static final int MSG_SC_KICK = 13;
    public static final int MSG_SC_Connected = 14;

    public static ByteBuf encodeHeader(ByteBufAllocator allocator, int cid, int msgId, int seq, int packSize) {
        return encodeHeader(allocator.directBuffer(packSize + 16), cid, msgId, seq, packSize);
    }

    public static ByteBuf encodeHeader(ByteBuf buf, int cid, int msgId, int seq, int packSize) {
        return buf.writeInt(cid)
                .writeInt(msgId)
                .writeInt(seq)
                .writeInt(packSize);
    }

    public static ByteBuf encodeHeader(ByteBufAllocator allocator, int msgId, int seq, int packSize) {
        return encodeHeader(allocator.directBuffer(packSize + 12), msgId, seq, packSize);
    }

    public static ByteBuf encodeHeader(ByteBuf buf, int msgId, int seq, int packSize) {
        return buf.writeInt(msgId)
                .writeInt(seq)
                .writeInt(packSize);
    }
}
