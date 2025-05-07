package sfm.web;

import io.netty.buffer.ByteBuf;


public abstract class Security {
    public void setParameter(byte[] o) {
        // son class to do
    }

    public byte[] doUpdate(byte[] o) {
        return o;
    }

    public byte[] doFinal(byte[] o) {
        return o;
    }

    public ByteBuf doUpdate(ByteBuf data) {
        return data;
    }
}
