package sfm.web.hot_swap_web_test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moderations")
public class Tns {
    @RequestMapping("/batch")
    public String check() throws InterruptedException {
        System.out.println("/moderations/batch");
        Thread.sleep(1000L * 10);
        return "{\n" +
                "  \"Risk\": 2,\n" +
                "  \"ModerationResultList\": [\n" +
                "    {\n" +
                "      \"Risk\": 2,\n" +
                "      \"Action\": {\n" +
                "        \"Type\": 5,\n" +
                "        \"Executed\": true,\n" +
                "        \"ExpireAt\": 1757247454\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }
}
