package sfm.web;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import org.apache.hc.core5.http.HttpHeaders;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
//        setWorldChat(7);
//        clearWorldChat(102);
//        clearWorldChat(103);
//        reload();
//        shield();
//        reduce();
//        replace();
//        reloadGameConf();
//        paid(false);
//        paid(false);
//        var key = "vlkcJd6phjZSuNPugSarXPTEQI5BKuhC";
//        var ts = 1767861412408L;
//        var str = "woshidaijiamideneirong";
//        System.out.println(generateSignature(str, key, ts));
        gm();
    }

    private static String generateSignature(String dataToSign, String key, long timestamp) throws Exception {
        System.out.println("token interceptor dataToSign:" + dataToSign + ", timestamp:" + timestamp);
        dataToSign += timestamp;
        System.out.println("token interceptor final dataToSign:" + dataToSign);
        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
        mac.init(secretKeySpec);
        byte[] rawHmac = mac.doFinal(dataToSign.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(rawHmac);
    }

    private static String generateSignature2(String dataToSign, String key, long timestamp) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA1");
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "HmacSHA1");
        mac.init(secretKeySpec);
        byte[] rawHmac = mac.doFinal(dataToSign.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(rawHmac);
    }

    private static void paid(boolean refund) throws Exception {
        var appKey = "PkcLwqzHHIcZ9REmY737LTyk6kHNkKZD";

        var ts = System.currentTimeMillis() / 1000L;
        var params = HttpClient.Params.build();
        params.addParam("sdk_open_id", "sfm502");
        params.addParam("role_id", "3735200842312885761");
        params.addParam("order_id", "1230001");
        params.addParam("product_id", "recharge.pst.coins1");
        params.addParam("balance", "300");
        params.addParam("app_id", "613238");
        params.addParam("create_time", String.valueOf(ts));
        params.addParam("currency_type", "USD");
        params.addParam("extra_info", "");
        params.addParam("gen_balance", "0");
        params.addParam("order_id_third", "GPA.3361-1506-5174-74499");
        params.addParam("os", "android");
        params.addParam("pay_channel", "10");
        params.addParam("pay_time", String.valueOf(ts));
        params.addParam("server_id", "8101");
        params.addParam("status", "2");
        params.addParam("total_amount", "999");
        if (refund) {
            params.addParam("notice_type", "REFUND");
        }

        var sortMap = new TreeMap<>(String::compareTo);
        sortMap.putAll(params.getParams());
        var list = new ArrayList<String>();
        for (Map.Entry<String, Object> entry : sortMap.entrySet()) {
            list.add(entry.getKey() + "=" + entry.getValue());
        }
        var paramString = String.join("&", list);
        var sign = generateSignature2(paramString, appKey, ts);
        params.addParam("sign", sign);

        var options = HttpClient.HeadOptions.build()
                .setContentType("application/x-www-form-urlencoded")
                .setHeader(HttpHeaders.ACCEPT, "application/json");

        try {
            var httpResp = HttpClient.post("http://127.0.0.1:12003/recharge/paid", params, options);//发送http请求
            System.out.println(httpResp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void gm() throws Exception {
        var secretKey = "vlkcJd6phjZSuNPugSarXPTEQI5BKuhC";

        var m = new HashMap<String, Object>();
//        m.put("user_id", 1558836624275278925L);
//        m.put("role_id", 1558836624275278939L);
        m.put("role_id", 3735202212971722755L);

        m.put("command", "ds");
        m.put("sub_command", "SetCameraRotation");
        m.put("params", new String[]{"0", "-90"});

//        m.put("command", "br");
//        m.put("sub_command", "getbattlerecord");
        var jsonString = JSON.toJSONString(m);
        var body = Base64.getEncoder().encodeToString(jsonString.getBytes(StandardCharsets.UTF_8));
        System.out.println("body:" + body);

        var ts = System.currentTimeMillis();
        var token = generateSignature(body, secretKey, ts);
        System.out.println("token:" + token);
        var options = HttpClient.HeadOptions.build()
                .setContentType("application/json")
                .setHeader(HttpHeaders.ACCEPT, "application/json")
                .setHeader("X-Token", token)
                .setHeader("timestamp", String.valueOf(ts));

        try {
            var httpResp = HttpClient.postBody("http://127.0.0.1:12003/gm", body, options);//发送http请求
            System.out.println(httpResp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void clearWorldChat(int id) {
        var key = "chat.world." + id;
        resetWorldChat(key, true, 0);
    }

    private static void setWorldChat(int num) {
        var key = "chat.world." + 101;
        resetWorldChat(key, false, num);
    }

    private static void resetWorldChat(String key, boolean isClear, int num) {
        try {
            var map = new HashMap<String, Object>();
            map.put("key", key);
            map.put("is_clear", isClear);
            map.put("num", num);
            map.put("ts", System.currentTimeMillis());


            var body = JSON.toJSONString(map);
            var msg = AESUtil.encrypt(body);

            var options = HttpClient.HeadOptions.build()
                    .setContentType("application/json")
                    .setHeader(HttpHeaders.ACCEPT, "application/json");

            var httpResp = HttpClient.postBody("http://localhost:12003/chat/world/reset", msg, options);//发送http请求
//            var httpResp = HttpClient.postBody("http://pst-test-external-hgate-1001.dailygn.com:12003/chat/world/reset", msg, options);//发送http请求
            System.out.println(httpResp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void reloadGameConf() {
        try {
            var options = HttpClient.HeadOptions.build()
//                    .setContentType("application/json")
                    .setEncoding("UTF-8")
                    .setHeader(HttpHeaders.ACCEPT, "application/json");

            var region = new HashMap<String, String>();
            region.put("cn", "1111");
            region.put("sg", "1111");
//            var m = new HashMap<String, Object>();
//            m.put("AppID", 613238);
//            m.put("RtcAppKey", "123456");
//            m.put("IsCe", false);
//            m.put("Region", region);
//            var str = JSON.toJSONString(m);
            //101.133.138.8:20000
            var str = "ServerRegion: sg\n" +
//                    "Region:\n" +
//                    "  \"cn\": 10\n" +
//                    "  \"sg\": 11\n" +
                    "IsCe: false\n";
            var base64 = Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8));
            System.out.println(base64);
//            var content = URLEncoder.encode(base64, StandardCharsets.UTF_8);

            var params = HttpClient.Params.build()
                    .addParam("reload_type", "reload_gameconf")
                    .addParam("svc_type", "gs")
                    .addParam("files", base64)
                    .addParam("timestamp", System.currentTimeMillis());

            var httpResp = HttpClient.get("http://127.0.0.1:12003/reload", params, options);//发送http请求
//            var httpResp = HttpClient.get("http://10.253.14.169:12003/reload", params, options);//发送http请求
            System.out.println(httpResp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void reduce() {
        try {
            var options = HttpClient.HeadOptions.build()
//                    .setContentType("application/json")
                    .setEncoding("UTF-8")
                    .setHeader(HttpHeaders.ACCEPT, "application/json");

            var params = HttpClient.Params.build()
                    .addParam("reload_type", "reload_reduce")
                    .addParam("svc_type", "ds")
                    .addParam("replicas", "1")
                    .addParam("timestamp", System.currentTimeMillis());

            var httpResp = HttpClient.get("http://127.0.0.1:12003/reload", params, options);//发送http请求
            System.out.println(httpResp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void replace() {
        try {
            var options = HttpClient.HeadOptions.build()
//                    .setContentType("application/json")
                    .setEncoding("UTF-8")
                    .setHeader(HttpHeaders.ACCEPT, "application/json");

            var params = HttpClient.Params.build()
                    .addParam("reload_type", "reload_replace")
                    .addParam("svc_type", "ds")
                    .addParam("clientver", "1")
//                    .addParam("interver", "1")
                    .addParam("replicas", "1")
                    .addParam("timestamp", System.currentTimeMillis());

            var httpResp = HttpClient.get("http://127.0.0.1:12003/reload", params, options);//发送http请求
            System.out.println(httpResp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void shield() {
        try {
            var options = HttpClient.HeadOptions.build()
//                    .setContentType("application/json")
                    .setEncoding("UTF-8")
                    .setHeader(HttpHeaders.ACCEPT, "application/json");

            var base64 = Base64.getEncoder().encodeToString("我爱习近平".getBytes());
            var content = URLEncoder.encode(base64, StandardCharsets.UTF_8);
            System.out.println(content);
            var params = HttpClient.Params.build()
                    .addParam("content", "奥术大师");

            var httpResp = HttpClient.get("http://127.0.0.1:12003/antidirt/shield", params, options);//发送http请求
//            var httpResp = HttpClient.get("http://10.253.14.169:12003/antidirt/shield", params, options);//发送http请求
            System.out.println(httpResp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void reload() {
        try {
//            var map = new HashMap<String, Object>();
////            map.put("reload_type", "reload_cfg");
////            map.put("svc_type", "gs");
////            map.put("timestamp", System.currentTimeMillis());
////            map.put("files", "ClassAttributes.data,SpecialItemRemedy.data");
////            map.put("files", "Constant");
//            map.put("reload_type", "reload_clz");
//            map.put("svc_type", "gs");
//            map.put("timestamp", System.currentTimeMillis());
//
//
//            var body = JSON.toJSONString(map);
//            body = "{ \"reload_type\":\"reload_cfg\", \"svc_type\":\"gs\", \"files\":\"ClassAttributes.data,SpecialItemRemedy.data\", \"timestamp\":\"1731307341624\" }";
//            var msg = AESUtil.encrypt(body);
//
//            System.out.println(body);
//            System.out.println(msg);
//            System.out.println(AESUtil.decrypt(msg));

            var options = HttpClient.HeadOptions.build()
//                    .setContentType("application/json")
                    .setHeader(HttpHeaders.ACCEPT, "application/json");

            var params = HttpClient.Params.build()
                    .addParam("reload_type", "reload_antidirt")
                    .addParam("svc_type", "gs")
                    .addParam("timestamp", System.currentTimeMillis());

            var httpResp = HttpClient.get("http://127.0.0.1:12003/reload", params, options);//发送http请求
//            var httpResp = HttpClient.get("http://10.253.14.169:12003/reload", params, options);//发送http请求
            System.out.println(httpResp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}