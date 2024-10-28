package sfm.web.design_pattern;

// 事件源
public class EventSource {
    private CustomEventListener listener;

    public void setListener(CustomEventListener listener) {
        this.listener = listener;
    }

    public void triggerEvent(String message) {
        CustomEvent event = new CustomEvent(message);
        if (listener!= null) {
            listener.onEventOccurred(event);
        }
    }
}
