package sfm.web;

import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.*;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.X509v3CertificateBuilder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;

import javax.security.auth.x500.X500Principal;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Base64;
import java.util.Date;
import java.util.Random;

public class CACertificateGenerator {

    static {
        // 注册 Bouncy Castle 提供者
        Security.addProvider(new BouncyCastleProvider());
    }

    public static void main(String[] args) {
        try {
            // 生成CA证书
            KeyPair caKeyPair = generateKeyPair();
            X509Certificate caCert = generateCACertificate(caKeyPair);

            // 保存CA证书
            saveCertificate(caCert, "ca.crt");
            savePrivateKey(caKeyPair.getPrivate(), "ca.key");

            System.out.println("CA证书已生成并保存");

            // 生成服务器证书
            KeyPair serverKeyPair = generateKeyPair();
            X509Certificate serverCert = generateServerCertificate(
                    serverKeyPair, caKeyPair, caCert, "localhost");

            // 保存服务器证书
            saveCertificate(serverCert, "server.crt");
            savePrivateKey(serverKeyPair.getPrivate(), "server.key");

            System.out.println("服务器证书已生成并保存");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 生成RSA密钥对
    private static KeyPair generateKeyPair() throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        return keyPairGenerator.generateKeyPair();
    }

    // 生成自签名CA证书
    private static X509Certificate generateCACertificate(KeyPair keyPair)
            throws OperatorCreationException, CertificateException, CertIOException {

        // 设置证书有效期（10年）
        Date startDate = new Date(System.currentTimeMillis());
        Date endDate = new Date(System.currentTimeMillis() + 10 * 365 * 24 * 60 * 60 * 1000L);

        // 生成随机序列号
        BigInteger serialNumber = new BigInteger(160, new Random());

        // 设置证书主体信息
        X500Name issuer = new X500Name("CN=MyCA,O=MyOrganization,C=CN");

        // 创建证书构建器
        X509v3CertificateBuilder certBuilder = new JcaX509v3CertificateBuilder(
                issuer,
                serialNumber,
                startDate,
                endDate,
                issuer,
                keyPair.getPublic()
        );

        // 添加基本约束：CA=true
        certBuilder.addExtension(
                Extension.basicConstraints,
                true,
                new BasicConstraints(true)
        );

        // 添加密钥用途
        certBuilder.addExtension(
                Extension.keyUsage,
                true,
                new KeyUsage(KeyUsage.keyCertSign | KeyUsage.cRLSign)
        );

        // 创建签名者
        ContentSigner contentSigner = new JcaContentSignerBuilder("SHA256withRSA")
                .setProvider("BC")
                .build(keyPair.getPrivate());

        // 构建证书
        X509CertificateHolder certHolder = certBuilder.build(contentSigner);
        return new JcaX509CertificateConverter()
                .setProvider("BC")
                .getCertificate(certHolder);
    }

    // 生成服务器证书（由CA签名）
    private static X509Certificate generateServerCertificate(
            KeyPair serverKeyPair, KeyPair caKeyPair, X509Certificate caCert, String hostname)
            throws OperatorCreationException, CertificateException, CertIOException {

        // 设置证书有效期（1年）
        Date startDate = new Date(System.currentTimeMillis());
        Date endDate = new Date(System.currentTimeMillis() + 365 * 24 * 60 * 60 * 1000L);

        // 生成随机序列号
        BigInteger serialNumber = new BigInteger(160, new Random());

        // 设置证书主体信息
        X500Name issuer = new X500Name(caCert.getSubjectX500Principal().getName());
        X500Name subject = new X500Name("CN=" + hostname + ",O=MyOrganization,C=CN");

        // 创建证书构建器
        X509v3CertificateBuilder certBuilder = new JcaX509v3CertificateBuilder(
                issuer,
                serialNumber,
                startDate,
                endDate,
                subject,
                serverKeyPair.getPublic()
        );

        // 添加基本约束：CA=false
        certBuilder.addExtension(
                Extension.basicConstraints,
                true,
                new BasicConstraints(false)
        );

        // 添加密钥用途
        certBuilder.addExtension(
                Extension.keyUsage,
                true,
                new KeyUsage(KeyUsage.digitalSignature | KeyUsage.keyEncipherment)
        );

        // 添加扩展用途（TLS Web服务器认证）
        certBuilder.addExtension(
                Extension.extendedKeyUsage,
                true,
                new ExtendedKeyUsage(KeyPurposeId.id_kp_serverAuth)
        );

        // 添加主题备用名称（SAN）
        GeneralName[] subjectAltNames = new GeneralName[] {
                new GeneralName(GeneralName.dNSName, hostname)
        };
        certBuilder.addExtension(
                Extension.subjectAlternativeName,
                false,
                new GeneralNames(subjectAltNames)
        );

        // 创建签名者（使用CA私钥签名）
        ContentSigner contentSigner = new JcaContentSignerBuilder("SHA256withRSA")
                .setProvider("BC")
                .build(caKeyPair.getPrivate());

        // 构建证书
        X509CertificateHolder certHolder = certBuilder.build(contentSigner);
        return new JcaX509CertificateConverter()
                .setProvider("BC")
                .getCertificate(certHolder);
    }

    // 保存证书到文件
    private static void saveCertificate(X509Certificate certificate, String filename)
            throws IOException, CertificateEncodingException {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write("-----BEGIN CERTIFICATE-----\n".getBytes());
            fos.write(Base64.getEncoder().encode(certificate.getEncoded()));
            fos.write("\n-----END CERTIFICATE-----".getBytes());
        }
    }

    // 保存私钥到文件
    private static void savePrivateKey(PrivateKey privateKey, String filename)
            throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write("-----BEGIN PRIVATE KEY-----\n".getBytes());
            fos.write(Base64.getEncoder().encode(privateKey.getEncoded()));
            fos.write("\n-----END PRIVATE KEY-----".getBytes());
        }
    }
}