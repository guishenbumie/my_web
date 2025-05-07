package sfm.web;

import org.bouncycastle.jce.provider.asymmetric.ec.EC5Util;
import org.bouncycastle.math.ec.ECPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.KeyPair;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;

public class NetKey {
    public static final Logger logger = LoggerFactory.getLogger(NetKey.class);
    private final KeyPair ecKeyPair;
    private final byte[] selfPublicKey;
    private byte[] selfSignature;
    private byte[] sharedSecretKey;

    public NetKey(boolean signature) {
        this(NetKeyHelper.getInstance().generateECKeyPair(), signature);
    }

    public NetKey(String ecKeyPairPem) {
        this(NetKeyHelper.getInstance().generateECKeyPair(ecKeyPairPem), true);
    }

    private NetKey(KeyPair keyPair, boolean signature) {
        ecKeyPair = keyPair;
        selfPublicKey = encodeSelfPublicKey();
        if (signature) {
            selfSignature = NetKeyHelper.getInstance().signature(selfPublicKey);
        }
    }

    public boolean calcSharedSecreteKey(PublicKey peerPublicKey) {
        sharedSecretKey = NetKeyHelper.getInstance().calcSharedSecretKey(ecKeyPair.getPrivate(), peerPublicKey);
        return sharedSecretKey.length > 0;
    }

    /**
     * 如果直接序列化公钥，将包含一些描述信息（X.509格式）。
     * 为了减少传输的字节数量，先从公钥提取ECPoint，然后将ECPoint序列化为字节数组
     * 原生库ECPoint没有GetEncoded方法，需要转换成bouncycastle库的ECPoint
     *
     * @return ECPoint序列化后的字节数组
     */
    private byte[] encodeSelfPublicKey() {
        ECPublicKey ecPublicKey = (ECPublicKey) ecKeyPair.getPublic();
        ECPoint ecPoint = EC5Util.convertPoint(ecPublicKey.getParams(), ecPublicKey.getW(), false);
        return ecPoint.getEncoded();
    }

    public byte[] getSelfPublicKey() {
        return selfPublicKey;
    }

    public byte[] getSelfSignature() {
        return selfSignature;
    }

    public byte[] getSharedSecretKey() {
        return sharedSecretKey;
    }
}
