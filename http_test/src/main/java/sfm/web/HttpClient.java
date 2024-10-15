package sfm.web;

import com.alibaba.fastjson2.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.hc.client5.http.HttpRequestRetryStrategy;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.entity.EntityBuilder;
import org.apache.hc.client5.http.impl.DefaultHttpRequestRetryStrategy;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.core5.http.*;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.http.message.BasicHeader;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.apache.hc.core5.util.TimeValue;
import org.apache.hc.core5.util.Timeout;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.TimeUnit;


public final class HttpClient {
    private static final CloseableHttpClient client = createHttpClient(100, 500,
            new DefaultHttpRequestRetryStrategy(2, TimeValue.ofMilliseconds(200L)));

    public static CloseableHttpClient defaultHttpClient() {
        return client;
    }

    public static CloseableHttpClient createHttpClient(int maxPerRoute, int maxTotal, HttpRequestRetryStrategy retryStrategy) {
        final var clientConnectionManager = new PoolingHttpClientConnectionManager();
        clientConnectionManager.setDefaultMaxPerRoute(maxPerRoute);
        clientConnectionManager.setMaxTotal(maxTotal);

        return HttpClients.custom()
                .setConnectionManager(clientConnectionManager)
                .evictIdleConnections(TimeValue.of(120, TimeUnit.SECONDS))
                .setRetryStrategy(retryStrategy)
                .build();
    }

    public static HttpResp execute(HttpUriRequest req, String encoding) throws Exception {
        return execute(client, req, encoding);
    }

    public static HttpResp execute(CloseableHttpClient client, HttpUriRequest req, String encoding) throws Exception {
        return client.execute(req, response -> {
            var status = response.getCode();
            var headers = response.getHeaders();
            var entity = response.getEntity();
            var body = entity != null ? EntityUtils.toString(entity, encoding) : null;
            return new HttpResp(status, headers, body);
        });
    }

    public static HttpResp get(String url, Params params, HeadOptions options) throws Exception {
        if (null == options) {
            options = HeadOptions.build();
        }
        var sendUrl = buildUrl(url, params);
        var get = new HttpGet(sendUrl);
        get.setConfig(options.getRequestConfig());
        options.getHeaders().forEach(get::addHeader);
        final var o = options;
        return execute(get, o.encoding);
    }

    /**
     * post请求 ，请求数据放到body里
     */
    public static HttpResp postBody(String url, String bodyData, HeadOptions options) throws Exception {
        if (null == options) {
            options = HeadOptions.build();
        }
        var httpPost = new HttpPost(url); // 请求地址
        httpPost.setConfig(options.getRequestConfig());
        options.getHeaders().forEach(httpPost::addHeader);
        httpPost.setEntity(new StringEntity(bodyData, StandardCharsets.UTF_8));
        try {
            return execute(httpPost, options.encoding);
        } finally {
            httpPost.reset();
        }
    }

    public static HttpResp postBody(CloseableHttpClient client, String url, String bodyData, HeadOptions options) throws Exception {
        if (null == options) {
            options = HeadOptions.build();
        }
        var httpPost = new HttpPost(url); // 请求地址
        httpPost.setConfig(options.getRequestConfig());
        options.getHeaders().forEach(httpPost::addHeader);
        httpPost.setEntity(new StringEntity(bodyData, StandardCharsets.UTF_8));
        try {
            return execute(client, httpPost, options.encoding);
        } finally {
            httpPost.reset();
        }
    }

    public static HttpResp post(String url, Params params, HeadOptions options) throws Exception {
        return post(client, url, params, options);
    }

    public static HttpResp post(CloseableHttpClient client, String url, Params params, HeadOptions options) throws Exception {
        if (null == options) {
            options = HeadOptions.build();
        }
        var sendUrl = buildUrl(url, params);
        var post = new HttpPost(sendUrl);
        if (params != null) {
            var entity = params.toEntity(options.getHeaderValue(HttpHeaders.CONTENT_TYPE));
            post.setEntity(entity);
        }
        post.setConfig(options.getRequestConfig());
        options.getHeaders().forEach(post::addHeader);
        return execute(client, post, options.encoding);
    }

    public static HttpResp put(String url, Params params, HeadOptions options) throws Exception {
        if (null == options) {
            options = HeadOptions.build();
        }
        var sendUrl = buildUrl(url, params);
        var put = new HttpPut(sendUrl);
        if (params != null) {
            var entity = params.toEntity(options.getHeaderValue(HttpHeaders.CONTENT_TYPE));
            put.setEntity(entity);
        }
        put.setConfig(options.getRequestConfig());
        options.getHeaders().forEach(put::addHeader);
        return execute(put, options.encoding);
    }

    public static HttpResp delete(String url, Params params, HeadOptions options) throws Exception {
        if (null == options) {
            options = HeadOptions.build();
        }
        var sendUrl = buildUrl(url, params);
        var delete = new HttpDelete(sendUrl);
        delete.setConfig(options.getRequestConfig());
        options.getHeaders().forEach(delete::addHeader);
        return execute(delete, options.encoding);
    }

    public static String urlEncode(String str) {
        try {
            return URLEncoder.encode(str, StandardCharsets.UTF_8);
        } catch (Exception e) {
            return str;
        }
    }

    private static String buildUrl(String url, Params p) {
        if (!url.startsWith("http")) {
            url = "http://" + url;
        }
        if (p == null || p.isEmpty()) {
            return url;
        }
        if (url.contains("?")) {
            return url + "&" + p.httpBuildQuery();
        } else {
            return url + "?" + p.httpBuildQuery();
        }
    }

    public static class HeadOptions {
        private Timeout connectTimeout = Timeout.of(3000, TimeUnit.MILLISECONDS);
        private Timeout readTimeout = Timeout.of(10000, TimeUnit.MILLISECONDS);
        private String encoding = "UTF-8";
        private final List<Header> headers;

        private HeadOptions() {
            headers = new ArrayList<>();
        }

        public static HeadOptions build() {
            return new HeadOptions();
        }

        public HeadOptions setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }

        public HeadOptions setHeader(String header, String content) {
            headers.add(new BasicHeader(header, content));
            return this;
        }

        public HeadOptions setContentType(String contentType) {
            return setHeader(HttpHeaders.CONTENT_TYPE, contentType);
        }

        public HeadOptions setAuthorization(String authorization) {
            return setHeader(HttpHeaders.AUTHORIZATION, authorization);
        }

        public String getHeaderValue(String header) {
            for (var h : headers) {
                if (StringUtils.equals(h.getName(), header)) {
                    return h.getValue();
                }
            }
            return null;
        }

        public List<Header> getHeaders() {
            return Collections.unmodifiableList(headers);
        }

        public HeadOptions setConnectTimeout(Timeout connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }

        public HeadOptions setReadTimeout(Timeout readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public RequestConfig getRequestConfig() {
            return RequestConfig.custom().setConnectionRequestTimeout(connectTimeout).setResponseTimeout(readTimeout).build();
        }

        public String getEncoding() {
            return encoding;
        }

        @Override
        public String toString() {
            return "HeadOptions{connectTimeout=" + connectTimeout + ", readTimeout=" + readTimeout + ", encoding='" + encoding + "', headers=" + headers + "}";
        }
    }

    public static class Params {
        private final Map<String, Object> p;

        private Params() {
            p = new TreeMap<>();
        }

        @Override
        public String toString() {
            return "Params{p=" + p + "}";
        }

        public static Params build() {
            return new Params();
        }

        public Map<String, Object> getParams() {
            return Collections.unmodifiableMap(p);
        }

        public Params addParam(String key, Object val) {
            if (StringUtils.isBlank(key) || val == null) {
                return this;
            }

            this.p.put(key, val);
            return this;
        }

        public String httpBuildQuery() {
            return httpBuildQuery(true);
        }

        public String httpBuildQuery(boolean urlEncode) {
            var queries = new ArrayList<>();
            for (var e : p.entrySet()) {
                var value = String.valueOf(e.getValue());
                queries.add(e.getKey() + "=" + (urlEncode ? HttpClient.urlEncode(value) : value));
            }
            return StringUtils.join(queries, "&");
        }

        public boolean isEmpty() {
            return this.p.isEmpty();
        }

        public HttpEntity toEntity(String contentType) throws UnsupportedEncodingException {
            var builder = EntityBuilder.create();
            var type = ContentType.parse(contentType);
            builder.setContentType(type);
            var mimeType = type.getMimeType();
            if (StringUtils.equalsIgnoreCase(ContentType.APPLICATION_JSON.getMimeType(), mimeType)) {
                var jsonObject = new JSONObject();
                jsonObject.putAll(p);
                builder.setText(jsonObject.toJSONString());
            } else if (StringUtils.equalsIgnoreCase(ContentType.APPLICATION_FORM_URLENCODED.getMimeType(), mimeType)) {
                var nameValuePairs = new ArrayList<NameValuePair>();
                for (var e : p.entrySet()) {
                    nameValuePairs.add(new BasicNameValuePair(e.getKey(), String.valueOf(e.getValue())));
                }
                builder.setParameters(nameValuePairs);
            } else {
                //TODO
                throw new UnsupportedEncodingException(mimeType);
            }
            return builder.build();
        }
    }

    public record HttpResp(int status, Header[] headers, String body) {
    }
}
