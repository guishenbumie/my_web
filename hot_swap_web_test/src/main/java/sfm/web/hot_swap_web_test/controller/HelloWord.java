package sfm.web.hot_swap_web_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWord {
    @RequestMapping("/helloworld")
    public String helloWorld() {
        System.out.println("hello world");
        return "Hello World";
    }
    @GetMapping("/ping")
    public String ping() {
        System.out.println("ping");
        return "pong";
    }
//    public String ping() {
//        System.out.println("ping1");
//        return "pong1";
//    }
}
