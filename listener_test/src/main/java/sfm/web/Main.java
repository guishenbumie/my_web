package sfm.web;

import com.google.common.eventbus.EventBus;
import sfm.web.annotation.EEvent;
import sfm.web.annotation.MyEvent;
import sfm.web.annotation.MySubscriber;

public class Main {
    public static void main(String[] args) {
//        EventSource source = new EventSource();
//        CustomEventLogger logger = new CustomEventLogger();
//        source.setListener(logger);
//        source.triggerEvent("Hello, custom event!");
        EventBus eventBus = new EventBus();
        MySubscriber subscriber = new MySubscriber();
        eventBus.register(subscriber);

//        MyEvent event = new MyEvent();
//        eventBus.post(event);
        eventBus.post(EEvent.RELOAD);
    }
}