package sfm.web.annotation;

import com.google.common.eventbus.Subscribe;

public class MySubscriber {
//    @Subscribe
//    public void handleEvent(MyEvent event) {
//        // 处理事件的逻辑
//        System.out.println("Received event: " + event);
//    }
    @Subscribe
    public void handleEvent(EEvent event) {
        // 处理事件的逻辑
        System.out.println("Received event: " + event);
    }
}
