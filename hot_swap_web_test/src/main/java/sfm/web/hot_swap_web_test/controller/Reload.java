package sfm.web.hot_swap_web_test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sfm.web.hotswap.HotSwapV2;

@RestController
@RequestMapping("/reload")
public class Reload {
    @RequestMapping("/load")
    public String load() {
        System.out.println("load");
        HotSwapV2.reloadAllClass(0);
        System.out.println("load success");
        return "load success";
    }
}

