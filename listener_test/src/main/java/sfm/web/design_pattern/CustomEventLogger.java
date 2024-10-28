package sfm.web.design_pattern;

// 监听器实现类
public class CustomEventLogger implements CustomEventListener {
    @Override
    public void onEventOccurred(CustomEvent event) {
        System.out.println("Custom event occurred: " + event.getMessage());
    }
}