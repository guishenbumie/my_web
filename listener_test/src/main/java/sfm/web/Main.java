package sfm.web;

import sfm.web.annotation_listen.ItemModule;
import sfm.web.annotation_listen.ReloadOnCfgChange;

import java.util.Map;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
////        EventSource source = new EventSource();
////        CustomEventLogger logger = new CustomEventLogger();
////        source.setListener(logger);
////        source.triggerEvent("Hello, custom event!");
//        EventBus eventBus = new EventBus();
//        MySubscriber subscriber = new MySubscriber();
//        eventBus.register(subscriber);
//
////        MyEvent event = new MyEvent();
////        eventBus.post(event);
//        eventBus.post(EEvent.RELOAD);
        var m = new ItemModule();
//        var cc = m.getClass();
//        m.test();
//        var cfg = Class.forName("ItemModule");
//        var annotation = cfg.getAnnotation(ReloadOnCfgChange.class);
        var method = ItemModule.class.getMethod("test");
        var annotation = method.getAnnotation(ReloadOnCfgChange.class);
    }
}