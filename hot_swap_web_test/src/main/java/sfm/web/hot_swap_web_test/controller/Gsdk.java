package sfm.web.hot_swap_web_test.controller;

import com.alibaba.fastjson2.JSON;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@CrossOrigin
@RestController
public class Gsdk {

    public static final String SDK_OPEN_ID = "test_open_id_123";
    public static final String DID = "123456";
    public static final int AGE_TYPE = 100;

    @RequestMapping("/gsdk/account/verify_user")
    public String verifyUser() {
        System.out.println("call verify_user");
        var data = new HashMap<String, Object>();
        data.put("sdk_open_id", SDK_OPEN_ID);
        data.put("device_id", DID);
        data.put("age_type", AGE_TYPE);
        var resp = new HashMap<String, Object>();
        resp.put("code", 0);
        resp.put("msg", "success");
        resp.put("data", data);
        return JSON.toJSONString(resp);
    }

    @RequestMapping("/gsdk/account/access_check")
    public String accessCheck() {
        System.out.println("call access_check");
        var resp = new HashMap<String, Object>();
        resp.put("code", 0);
        resp.put("msg", "success");
        return JSON.toJSONString(resp);
    }

    @GetMapping("/gsdk/wallet/get_balance")
    public String getBalance() {
        System.out.println("call get_balance");
        var data = new HashMap<String, Object>();
        data.put("balance", 200);
        var resp = new HashMap<String, Object>();
        resp.put("code", 0);
        resp.put("msg", "success");
        resp.put("data", data);
        return JSON.toJSONString(resp);
    }

    @RequestMapping("/gsdk/wallet/pay")
    public String pay() {
        System.out.println("call pay");
        var data = new HashMap<String, Object>();
        data.put("bill_no", "12123");
        data.put("balance", 200);
        var resp = new HashMap<String, Object>();
        resp.put("code", 0);
        resp.put("msg", "success");
        resp.put("data", data);
        return JSON.toJSONString(resp);
    }

    @RequestMapping("/gsdk/wallet/refund")
    public String refund() {
        System.out.println("call refund");
        var resp = new HashMap<String, Object>();
        resp.put("code", 0);
        resp.put("msg", "success");
        return JSON.toJSONString(resp);
    }
}
