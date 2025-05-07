package sfm.web.hot_swap_web_test.controller;

import com.alibaba.fastjson2.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/check")
public class Anti {
    @RequestMapping("/test")
    public String test() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        var m = Map.of("status_code", 200, "msg", "ok");
        var resp = JSON.toJSONString(m);
        System.out.println(resp);
        return resp;
    }
}