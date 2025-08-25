package sfm.web;

import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.io.HttpRequestHandler;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.http.protocol.HttpContext;
import org.apache.hc.core5.http.impl.bootstrap.HttpServer;
import org.apache.hc.core5.http.impl.bootstrap.ServerBootstrap;
import org.apache.hc.core5.http.ssl.TLS;
import org.apache.hc.core5.ssl.PrivateKeyDetails;
import org.apache.hc.core5.ssl.PrivateKeyStrategy;
import org.apache.hc.core5.ssl.SSLContextBuilder;
import org.apache.hc.core5.util.Timeout;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class HttpsServer {

    public static void main(String[] args) throws Exception {
        // CA证书路径
        String caCertPath = "ca.crt";

        // 服务器证书和私钥（PEM格式）
        String serverCertPath = "server.crt";
        String serverKeyPath = "server.key";

        // 创建SSLContext
        SSLContext sslContext = createSSLContext(caCertPath, serverCertPath, serverKeyPath);

        // 配置服务器
        HttpServer server = ServerBootstrap.bootstrap()
                .setListenerPort(8443)
                .setSslContext(sslContext)
                .register("/hello", new HelloRequestHandler())
                .create();

        // 启动服务器
        server.start();
        System.out.println("HTTPS服务器已启动，监听端口: 8443");
        System.out.println("按任意键停止服务器...");
        System.in.read();

        // 停止服务器
        server.stop();
    }

    // 创建SSLContext，直接使用PEM格式证书
    private static SSLContext createSSLContext(String caCertPath, String serverCertPath, String serverKeyPath)
            throws Exception {

        // 创建空的信任库
        KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
        trustStore.load(null, null);

        // 加载CA证书到信任库
        try (FileInputStream fis = new FileInputStream(caCertPath)) {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            X509Certificate caCert = (X509Certificate) cf.generateCertificate(fis);
            trustStore.setCertificateEntry("ca", caCert);
        }

        // 创建密钥库
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);

        // 加载服务器证书
        X509Certificate serverCert;
        try (FileInputStream fis = new FileInputStream(serverCertPath)) {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            serverCert = (X509Certificate) cf.generateCertificate(fis);
        }

        // 加载服务器私钥
        PrivateKey privateKey = loadPrivateKey(serverKeyPath);

        // 将证书和私钥添加到密钥库
        keyStore.setKeyEntry(
                "server",
                privateKey,
                "changeit".toCharArray(),
                new java.security.cert.Certificate[] { serverCert }
        );

        // 创建SSLContext
        return SSLContextBuilder.create()
                .loadTrustMaterial(trustStore, null)
                .loadKeyMaterial(keyStore, "changeit".toCharArray())
                .build();
    }

    // 从PEM文件加载私钥
    private static PrivateKey loadPrivateKey(String keyPath) throws Exception {
        String privateKeyPEM = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(keyPath)));

        // 移除PEM头部和尾部
        privateKeyPEM = privateKeyPEM
                .replace("-----BEGIN PRIVATE KEY-----", "")
                .replace("-----END PRIVATE KEY-----", "")
                .replaceAll("\\s+", "");

        // 解码Base64
        byte[] encoded = Base64.getDecoder().decode(privateKeyPEM);

        // 转换为PrivateKey对象
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(encoded);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePrivate(keySpec);
    }

    // 处理/hello路径的请求
    static class HelloRequestHandler implements HttpRequestHandler {
        @Override
        public void handle(
                final ClassicHttpRequest request,
                final ClassicHttpResponse response,
                final HttpContext context) throws IOException {

            System.out.println("收到请求: " + request.getMethod() + " " + request.getPath());

            // 设置响应
            response.setCode(HttpStatus.SC_OK);
            response.setEntity(new StringEntity(
                    "Hello from HTTPS server!",
                    ContentType.TEXT_PLAIN.withCharset("UTF-8")));
        }
    }
}
