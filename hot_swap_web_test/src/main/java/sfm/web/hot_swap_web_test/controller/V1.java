package sfm.web.hot_swap_web_test.controller;

import com.alibaba.fastjson2.JSON;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/v1")
public class V1 {
    @RequestMapping("/report")
    public String report(@RequestBody String bodyData) {
//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        JSONObject jsonObject = JSON.parseObject(bodyData);
        var type = jsonObject.get("counter_type");
        System.out.println(type);
        var metric = jsonObject.get("metric");
        System.out.println(metric);
        var value = jsonObject.get("value");
        System.out.println(value);
        var tags = jsonObject.get("tags");
        System.out.println(tags);
        var m = Map.of("status_code", 200, "msg", "ok");
        var resp = JSON.toJSONString(m);
        System.out.println(resp);
        return resp;
    }

    @RequestMapping("/batch_report")
    public String batchReport(@RequestBody String bodyData) {
        JSONObject jsonObject = JSON.parseObject(bodyData);
        var reqs = (JSONArray)jsonObject.get("reqs");
        System.out.println(reqs);
        for (var req : reqs) {
            var reqObj = (JSONObject)req;
            var type = reqObj.get("counter_type");
            System.out.println(type);
            var metric = reqObj.get("metric");
            System.out.println(metric);
            var value = reqObj.get("value");
            System.out.println(value);
            var tags = reqObj.get("tags");
            System.out.println(tags);
        }
        var m = Map.of("status_code", 200, "msg", "ok");
        var resp = JSON.toJSONString(m);
        System.out.println(resp);
        return resp;
    }
}