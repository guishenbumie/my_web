package sfm.web;

import com.alibaba.fastjson2.JSON;
import org.apache.hc.core5.http.HttpHeaders;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//        setWorldChat(7);
//        clearWorldChat(102);
//        clearWorldChat(103);
//        reload();
        shield();
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

    private static void shield() {
        try {
            var options = HttpClient.HeadOptions.build()
//                    .setContentType("application/json")
                    .setEncoding("UTF-8")
                    .setHeader(HttpHeaders.ACCEPT, "application/json");

            var base64 = Base64.getEncoder().encodeToString("我爱习近平".getBytes());
            var content = URLEncoder.encode(base64, StandardCharsets.UTF_8);
            System.out.println(content);
//            var params = HttpClient.Params.build()
//                    .addParam("content", "奥术大师");

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