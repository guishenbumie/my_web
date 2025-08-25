package sfm.web;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.config.TlsConfig;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
import org.apache.hc.client5.http.ssl.*;
import org.apache.hc.core5.http.impl.DefaultAddressResolver;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.protocol.HttpContext;
import org.apache.hc.core5.http.ssl.TLS;
import org.apache.hc.core5.ssl.SSLContextBuilder;
import org.apache.hc.core5.util.Timeout;

import javax.net.ssl.*;
import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class HttpsClient {
    public static void main(String[] args) {
        try {
            // 接口URL
            String apiUrl = "https://10.95.129.172:8002/test2";
            String certPath = "server.crt";

            // 创建HTTPS客户端
            CloseableHttpClient httpClient = createHttpsClient(certPath);

            // 创建GET请求
            HttpGet httpGet = new HttpGet(apiUrl);

//            // 添加请求头（如有需要）
//            httpGet.setHeader("Content-Type", "application/json");
//            httpGet.setHeader("Authorization", "Bearer YOUR_TOKEN");

            // 配置请求超时
            httpGet.setConfig(org.apache.hc.client5.http.config.RequestConfig.custom()
                    .setConnectTimeout(Timeout.ofSeconds(2))
                    .setResponseTimeout(Timeout.ofSeconds(3))
                    .build());

            // 执行请求并处理响应
            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                int statusCode = response.getCode();
                String responseBody = EntityUtils.toString(response.getEntity());

                System.out.println("请求URL: " + apiUrl);
                System.out.println("状态码: " + statusCode);
                System.out.println("响应体: " + responseBody);
            }

        } catch (Exception e) {
            System.err.println("访问API失败: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 创建支持HTTPS的客户端
    private static CloseableHttpClient createHttpsClient(String certPath)
            throws Exception {

        // 手动解析PEM证书
        KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
        trustStore.load(null, null);

        // 从PEM文件加载证书
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        X509Certificate cert = (X509Certificate) cf.generateCertificate(
                Files.newInputStream(Paths.get(certPath)));

        // 将证书添加到信任库
        trustStore.setCertificateEntry("server", cert);

        // 创建SSLContext
        SSLContext sslContext = SSLContextBuilder.create()
                .loadTrustMaterial(trustStore, null)
                .build();

//        // 2. 创建 TLS 配置（设置协议、密码套件等）
//        TlsConfig tlsConfig = TlsConfig.custom()
//                .setTlsVersions("TLSv1.3", "TLSv1.2")  // 指定支持的 TLS 版本
//                .setProtocols("HTTP/1.1", "HTTP/2")    // 指定支持的应用层协议
//                .setCipherSuites("TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256")  // 指定密码套件
//                .build();
//
//        // 3. 创建 TLS 配置解析器（核心：替代旧版 setTlsStrategy）
//        TlsConfigResolver tlsConfigResolver = tls -> tlsConfig;

//        // 4. 创建 SSL 连接工厂
//        SSLConnectionSocketFactory sslSocketFactory = new SSLConnectionSocketFactory(
//                sslContext,
//                NoopHostnameVerifier.INSTANCE
////                tlsConfigResolver
//        );

        TlsSocketStrategy tlsSocketStrategy = new DefaultClientTlsStrategy(sslContext, NoopHostnameVerifier.INSTANCE);
        // 5. 注册连接工厂（支持 HTTP 和 HTTPS）
        PoolingHttpClientConnectionManager cm = PoolingHttpClientConnectionManagerBuilder.create()
//                .setSSLSocketFactory(sslSocketFactory)  // 配置 HTTPS 连接工厂
//                .setDefaultTlsConfig(tlsConfig)  // 设置默认 TLS 配置（可选）
//                .setConnectionConfigResolver(tlsConfigResolver)  // 配置连接配置解析器
                .setTlsSocketStrategy(tlsSocketStrategy)
                .build();

        // 创建HTTP客户端
        return HttpClients.custom()
                .setConnectionManager(cm)
                .build();
    }
}
