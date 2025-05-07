package sfm.web;

import org.apache.commons.lang3.tuple.Pair;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.asymmetric.ec.ECUtil;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.KeyAgreement;
import java.io.StringReader;
import java.security.Security;
import java.security.*;
import java.security.interfaces.ECPublicKey;
import java.security.spec.*;
import java.util.Base64;

public class NetKeyHelper {
    public static final Logger logger = LoggerFactory.getLogger(NetKeyHelper.class);
    private static final NetKeyHelper instance = new NetKeyHelper();
    public static final String KEY_PAIR_ALGORITHM = "EC";
    public static final String KEY_AGREEMENT_ALGORITHM = "ECDH";
    public static final String EC_GEN_PARAMETER = "secp256r1";

    public static final String RSA_ALGORITHM = "RSA";
    public static final String SIGNATURE_ALGORITHM = "SHA256withRSA/PSS";
    private static final PSSParameterSpec pssParameterSpec = new PSSParameterSpec("SHA256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1);
    public static final byte[] EMPTY_BYTES = new byte[0];
    private ECParameterSpec ecParameterSpec;

//    private volatile boolean needKeyExchange;

//    private final RateLimiter keyExchangeRateLimiter = RateLimiter.create(1000.0D);
//    private int maxKeyExchangeRate;
//    private volatile LRUCache<ByteString, NetKey> netKeyCache;

    public static NetKeyHelper getInstance() {
        return instance;
    }

    private KeyPairGenerator ecKeyPairGenerator;
    private KeyFactory ecKeyFactory;
    private PrivateKey rsaPrivateKey;
    private PublicKey rsaPublicKey;

    private NetKeyHelper() {
    }

    public Pair<String, String> genRsaKeyPair() {
        // 获取 RSA 密钥对生成器
        KeyPairGenerator keyPairGenerator;
        try {
            keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        } catch (NoSuchAlgorithmException e) {
            logger.error(e.getMessage());
            return null;
        }
        // 设置密钥大小为 2048 位
        keyPairGenerator.initialize(1024);
        // 生成密钥对
        var keyPair = keyPairGenerator.generateKeyPair();
        if (keyPair == null) {
            return null;
        }
        // 将公钥和私钥转换为 Base64 编码的字符串
        String privateKeyBase64 = Base64.getEncoder().encodeToString(keyPair.getPrivate().getEncoded());
        String publicKeyBase64 = Base64.getEncoder().encodeToString(keyPair.getPublic().getEncoded());
        return Pair.of(privateKeyBase64, publicKeyBase64);
    }

    public void init() {
//        this.needKeyExchange = conf.getNeedKeyExchange();
        var rsaPrivateKey = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAMCDjDbpm1tOSpt+Qypc0UyfHxooQHKO+8YIRsgZdDhb5Zez3F8/znKkO07k8fAF9q27fApwJolH0bIjlOkX8KY8fn+o4nIBzwbK93tLT/jsUuRS6uzuW1pihLFOK75e6R0rNE/mhqn6mjr/ddGAXGI0DW82bSDZgU02kTi4+LmzAgMBAAECgYBFlse2idc4uCJL9uY8h/S4Z8SMZgR15K2qNg+wAVN7k+x4W/HLFHuCAU/XAvdZti4nOuBpvYSQlz97z1TitV6teCielaxrxCFI3n35TTIdMeWOr0/CCF2s13014kv294Kv4rcSU9VhgxPOr3Pt4bGoraD0ebBhSZKz/jc6e1BEAQJBAOFti34Yco2OTi5VgeQJglLryIkJCR2/Nlsc9XEUsbn5nKG938OD3jWT4s07bls/tIRDbFLdVTORos87BuvU5QECQQDan0kfaPa9Ar9Qav6I2IQr+HfImjreYVd5xyjnbCVPT4LmMQdvoV+5S+rucdSdWOiRGnOtdNWMFnb6RFA/WpqzAkEA0dGLP19z5+unOxsdXem34oRRT7MYSBa8egu3K3xue8IoFqdLCYjIn6e5Nvr1GXtvAphaz7nw3qHUHvw60fCDAQJBAMpCg4wjt+K2H/lug35nkiB8B5X32m7S7/MiZp10WDBAB4Kf6ZlFWyI7MmbXuTS5hLB6IHthlA++2ORBP1zdnjECQQC9Wcu8NJiwppcrZkL4fvtbTZ+cTpWqFYDkDguAHPNe9tuI+uajTwS5ucgMSCaypf0YOJObM+zMWe3arBNlZMOu";
        var rsaPublicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDAg4w26ZtbTkqbfkMqXNFMnx8aKEByjvvGCEbIGXQ4W+WXs9xfP85ypDtO5PHwBfatu3wKcCaJR9GyI5TpF/CmPH5/qOJyAc8Gyvd7S0/47FLkUurs7ltaYoSxTiu+XukdKzRP5oap+po6/3XRgFxiNA1vNm0g2YFNNpE4uPi5swIDAQAB";

        try {
            initECKeyGenerator();
            initECParameterSpec();
            initECKeyFactory();
            initRSA(rsaPrivateKey, rsaPublicKey);
        } catch (Exception e) {
            logger.error("construct NetKeyHelper", e);
        }
    }

    private void initECKeyGenerator() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        ecKeyPairGenerator = KeyPairGenerator.getInstance(KEY_PAIR_ALGORITHM);
        ECGenParameterSpec ecGenParameterSpec = new ECGenParameterSpec(EC_GEN_PARAMETER);
        SecureRandom random = new SecureRandom();
        ecKeyPairGenerator.initialize(ecGenParameterSpec, random);
    }

    private void initECParameterSpec() {
        // 先生成一对密钥，再从中获取参数。没有找到更好的办法
        KeyPair ecKeyPair = generateECKeyPair();
        ECPublicKey ecPublicKey = (ECPublicKey) (ecKeyPair.getPublic());
        ecParameterSpec = ecPublicKey.getParams();
    }

    private void initECKeyFactory() throws NoSuchAlgorithmException {
        ecKeyFactory = KeyFactory.getInstance(KEY_PAIR_ALGORITHM);
    }

    private void initRSA(String privateKeyBase64, String publicKeyBase64) throws InvalidKeySpecException, NoSuchAlgorithmException {
        Security.addProvider(new BouncyCastleProvider());

        KeyFactory rsaKeyFactory = KeyFactory.getInstance(RSA_ALGORITHM);

        PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(privateKeyBase64));
        this.rsaPrivateKey = rsaKeyFactory.generatePrivate(privateKeySpec);

        X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(Base64.getDecoder().decode(publicKeyBase64));
        rsaPublicKey = rsaKeyFactory.generatePublic(publicKeySpec);
    }

//    private void initMaxCacheSize(int maxCacheSize) {
//        synchronized (this) {
//            if (maxCacheSize > 0) {
//                netKeyCache = new LRUCache<>(maxCacheSize);
//            } else {
//                netKeyCache = null;
//            }
//            logger.info("init maxCacheSize:{}", maxCacheSize);
//        }
//    }
//
//    private void initKeyExchangeRateLimiter(int maxKeyExchangeRate) {
//        this.maxKeyExchangeRate = maxKeyExchangeRate;
//        if (maxKeyExchangeRate > 0) {
//            keyExchangeRateLimiter.setRate(maxKeyExchangeRate);
//            logger.info("initKeyExchangeRateLimiter maxKeyExchangeRate:{}", maxKeyExchangeRate);
//        }
//    }

    public KeyPair generateECKeyPair() {
        return ecKeyPairGenerator.generateKeyPair();
    }

    public KeyPair generateECKeyPair(String ecKeyPairPem) {
        PemReader pemReader = new PemReader(new StringReader(ecKeyPairPem));
        try {
            PemObject pemObject = pemReader.readPemObject();
            byte[] privateKeyBytes = pemObject.getContent();
            pemObject = pemReader.readPemObject();
            byte[] publicKeyBytes = pemObject.getContent();

            PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(privateKeyBytes);
            X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);
            PrivateKey privateKey = ecKeyFactory.generatePrivate(privateKeySpec);
            PublicKey publicKey = ecKeyFactory.generatePublic(publicKeySpec);
            return new KeyPair(publicKey, privateKey);
        } catch (Exception e) {
            logger.error("generateECKeyPair", e);
            return null;
        }
    }

    public PublicKey generateECPublicKey(byte[] peerPublicKeyBytes) {
        try {
            X9ECParameters params = ECUtil.getNamedCurveByOid(X9ObjectIdentifiers.prime256v1);
            org.bouncycastle.math.ec.ECPoint point = params.getCurve().decodePoint(peerPublicKeyBytes);
            ECPoint w = new ECPoint(point.getX().toBigInteger(), point.getY().toBigInteger());
            ECPublicKeySpec keySec = new ECPublicKeySpec(w, ecParameterSpec);
            return ecKeyFactory.generatePublic(keySec);
        } catch (Exception e) {
            logger.error("generateECPublicKey", e);
            return null;
        }
    }

    public byte[] calcSharedSecretKey(PrivateKey selfPrivateKey, PublicKey peerPublicKey) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance(KEY_AGREEMENT_ALGORITHM);
            keyAgreement.init(selfPrivateKey);
            keyAgreement.doPhase(peerPublicKey, true);
            return keyAgreement.generateSecret();
        } catch (Exception e) {
            logger.error("calcSharedSecretKey", e);
            return EMPTY_BYTES;
        }
    }

    public byte[] signature(byte[] data) {
        try {
            Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
            signature.setParameter(pssParameterSpec);
            signature.initSign(rsaPrivateKey);
            signature.update(data);
            return signature.sign();
        } catch (Exception e) {
            logger.error("signature exception", e);
            return EMPTY_BYTES;
        }
    }

    public boolean verify(byte[] data, byte[] signatureBytes) {
        try {
            Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
            signature.setParameter(pssParameterSpec);
            signature.initVerify(rsaPublicKey);
            signature.update(data);
            return signature.verify(signatureBytes);
        } catch (Exception e) {
            logger.error("verify exception", e);
            return false;
        }
    }

//    public boolean needKeyExchange() {
//        return needKeyExchange;
//    }
//
//    public void setNeedKeyExchange(boolean needKeyExchange) {
//        this.needKeyExchange = needKeyExchange;
//    }

//    public NetKey createNetKey(ByteString clientPublicKeyBytes) {
//        NetKey cachedNetKey = tryGetCache(clientPublicKeyBytes);
//        if (cachedNetKey != null) {
//            logger.info("createNetKey cache hit");
//            return cachedNetKey;
//        }
//
//        // 先校验客户端公钥，再生成密钥对。如果遇到了非法协议，可以减少计算量
//        PublicKey clientPublicKey = NetKeyHelper.getInstance().generateECPublicKey(clientPublicKeyBytes.toByteArray());
//        if (clientPublicKey == null) {
//            logger.info("generate clientPublicKey failed");
//            return null;
//        }
//
//        if (maxKeyExchangeRate > 0 && !keyExchangeRateLimiter.tryAcquire()) {
//            logger.info("createNetKey keyExchange rate limited");
//            return null;
//        }
//
//        NetKey netKey = new NetKey(true);
//        if (!netKey.calcSharedSecreteKey(clientPublicKey)) {
//            logger.info("calcSharedSecreteKey failed");
//            return null;
//        }
//        tryPutCache(clientPublicKeyBytes, netKey);
//        return netKey;
//    }
//
//    private synchronized NetKey tryGetCache(ByteString clientPublicKeyBytes) {
//        if (netKeyCache != null) {
//            return netKeyCache.get(clientPublicKeyBytes);
//        }
//        return null;
//    }
//
//    private synchronized void tryPutCache(ByteString clientPublicKeyBytes, NetKey netKey) {
//        if (netKeyCache != null) {
//            netKeyCache.put(clientPublicKeyBytes, netKey);
//        }
//    }
}
