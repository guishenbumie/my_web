package sfm.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @RequestMapping(value = "/hotswap.do")
    public String doHotSwap() {
        System.out.println("hotswap");
        HotSwapAgent.reloadAllClasses(null, 1);
        return "hotswap";
    }
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}
