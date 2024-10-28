package sfm.web;

import com.alibaba.fastjson2.JSON;
import org.apache.hc.core5.http.HttpHeaders;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;

public class Main {
    private final static String KEY = "0df2aff36b49875b96eed999ab747c48";

    public static void main(String[] args) {
//        var str = "aaa";
//        try {
//            var sign = AESUtil.encrypt(str);
//            System.out.println(sign);
//            var res = AESUtil.decrypt(sign);
//            System.out.println(res);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        try {
            var map = new HashMap<String, Object>();
            map.put("reload_type", 1);
            map.put("timestamp", System.currentTimeMillis());
            var body = JSON.toJSONString(map);
            var msg = AESUtil.encrypt(body);

            System.out.println(msg);
            System.out.println(AESUtil.decrypt(msg));

            var options = HttpClient.HeadOptions.build()
                    .setContentType("application/json")
                    .setHeader(HttpHeaders.ACCEPT, "application/json");

            var httpResp = HttpClient.postBody("http://localhost:12003/reload", msg, options);//发送http请求
            System.out.println(httpResp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}