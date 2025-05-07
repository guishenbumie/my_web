package sfm.web;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;


public class SecurityHandler extends ChannelDuplexHandler {
    private static final Logger logger = LoggerFactory.getLogger(SecurityHandler.class);
    private Security readSecurity = NullSecurity.NULLSECURITY;
    private Security writeSecurity = NullSecurity.NULLSECURITY;

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        securityUpdate(msg, true);
        super.channelRead(ctx, msg);
    }

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
//        ARCFourSecurity oldSnap = new ARCFourSecurity((ARCFourSecurity)writeSecurity);
        securityUpdate(msg, false);
//        if (msg instanceof ByteBuf buf) {
//            logger.info("after securityUpdate size={} dump=\n{}", buf.readableBytes(), ByteBufUtil.prettyHexDump(buf));
//            var reverse = oldSnap.doUpdate(buf.copy());
//            logger.info("reverse now size={} dump=\n{}", reverse.readableBytes(), ByteBufUtil.prettyHexDump(reverse));
//        }
        super.write(ctx, msg, promise);
    }

    private void securityUpdate(Object msg, boolean read) {
        if (msg instanceof ByteBuf data) {
            Security security = read ? readSecurity : writeSecurity;
            security.doUpdate(data);
        }
    }

    /**
     * 跳过秘钥交换步骤的加密流程 <br/>
     * 比如gs-ds之间的秘钥通过etcd获取,nonce直接写死
     */
    public SecurityHandler setupSecurity(String token, String writeNonce, String readNonce) {
        var bt = token.getBytes();
        setupWriteSecurity(bt, generateNonce(writeNonce));
        setupReadSecurity(bt, generateNonce(readNonce));
        return this;
    }

    public byte[] setupReadSecurity(String token) {
        return setupReadSecurity(token.getBytes());
    }

    public byte[] setupWriteSecurity(String token) {
        return setupWriteSecurity(token.getBytes());
    }

    public byte[] setupReadSecurity(byte[] token) {
        byte[] nonce = generateNonce();
        setupReadSecurity(token, nonce);
        return nonce;
    }

    public byte[] setupWriteSecurity(byte[] token) {
        byte[] nonce = generateNonce();
        setupWriteSecurity(token, nonce);
        return nonce;
    }

    public void setupReadSecurity(byte[] token, byte[] nonce) {
        readSecurity = createSecurity(token, nonce);
    }

    public void setupWriteSecurity(byte[] token, byte[] nonce) {
        writeSecurity = createSecurity(token, nonce);
    }

    private static ARCFourSecurity createSecurity(byte[] token, byte[] nonce) {
        byte[] key = generateKey(token, nonce);
        ARCFourSecurity security = new ARCFourSecurity();
        security.setParameter(key);
        return security;
    }

    private static byte[] generateKey(byte[] token, byte[] nonce) {
        byte[] key = new byte[16];
        HmacMd5Hash hash = new HmacMd5Hash();
        hash.setParameter(token);
        hash.doUpdate(nonce);
        hash.doFinal(key);
        logger.debug("generate key: token:{} nonce:{} key:{}", token, nonce, key);
        return key;
    }

    public static byte[] generateNonce() {
        UUID uuid = UUID.randomUUID();
        ByteBuffer bb = ByteBuffer.wrap(new byte[16]);
        bb.putLong(uuid.getMostSignificantBits());
        bb.putLong(uuid.getLeastSignificantBits());
        return bb.array();
    }

    public static byte[] generateNonce(String str) {
        return Arrays.copyOf(str.getBytes(), 16);
    }
}
