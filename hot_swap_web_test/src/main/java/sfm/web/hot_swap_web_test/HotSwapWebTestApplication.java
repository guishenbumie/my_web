package sfm.web.hot_swap_web_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sfm.web.hot_swap_web_test.controller.agones.AgonesMgr;

@SpringBootApplication
public class HotSwapWebTestApplication {

    public static void main(String[] args) {
        AgonesMgr.INS.init(0);
        SpringApplication.run(HotSwapWebTestApplication.class, args);
    }

}
