package sfm.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class WebService {
    public void start() {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(WebService.class);
        builder.run();
    }
}
