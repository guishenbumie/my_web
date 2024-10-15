package sfm.web;

import org.apache.hc.core5.http.HttpHeaders;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            var options = HttpClient.HeadOptions.build()
                    .setContentType("application/x-www-form-urlencoded;charset=utf-8")
                    .setHeader(HttpHeaders.ACCEPT, "application/json");
            var httpResp = HttpClient.postBody("http://localhost:8080/hotswap.do", "", options);//发送http请求
            System.out.println(httpResp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}