package sfm.web;

import io.netty.buffer.ByteBuf;
import io.netty.util.ByteProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public final class ARCFourSecurity extends Security {
    private static final Logger logger = LoggerFactory.getLogger(ARCFourSecurity.class);
    private final byte[] perm = new byte[256];
    private byte index1;
    private byte index2;

    public ARCFourSecurity() {
    }

    public ARCFourSecurity(ARCFourSecurity other) {
        index1 = other.index1;
        index2 = other.index2;
        System.arraycopy(other.perm, 0, perm, 0, 256);
    }

    @Override
    public void setParameter(byte[] o) {
        int keylen = o.length;
        byte j = 0;
        int i;
        for (i = 0; i < 256; ++i) {
            this.perm[i] = (byte) i;
        }

        for (i = 0; i < 256; ++i) {
            j = (byte) (j + this.perm[i] + o[i % keylen]);
            byte k = this.perm[i];
            this.perm[i] = this.perm[j & 255];
            this.perm[j & 255] = k;
        }

        this.index1 = 0;
        this.index2 = 0;
//        var sb = new StringBuilder();
//        for (i = 0; i < 256; ++i) {
//            sb.append(perm[i] & 0xFF).append(" ");
//        }
//        logger.info("perm={}", sb);
    }

    @Override
    public byte[] doUpdate(byte[] o) {
        for (int i = 0; i < o.length; ++i) {
            byte oldByte = o[i];
            byte newByte = calcNewByte(oldByte);
            o[i] = newByte;
        }
        return o;
    }

    private byte calcNewByte(byte oldByte) {
        var idx1 = ++this.index1 & 255;
        byte k = this.perm[idx1];
        this.index2 += k;
        var idx2 = this.index2 & 255;
        this.perm[idx1] = this.perm[idx2];
        this.perm[idx2] = k;
        byte j = (byte) (this.perm[idx1] + k);
        return (byte) (oldByte ^ this.perm[j & 255]);
    }

    @Override
    public ByteBuf doUpdate(ByteBuf data) {
        data.forEachByte(new ByteProcessor() {
            private int index;

            public ByteProcessor init(int index) {
                this.index = index;
                return this;
            }

            @Override
            public boolean process(byte value) {
                byte newValue = calcNewByte(value);
                data.setByte(index, newValue);
                index++;
                return true;
            }
        }.init(data.readerIndex()));
        return data;
    }
}
