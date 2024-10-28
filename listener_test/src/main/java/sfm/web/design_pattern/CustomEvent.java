package sfm.web.design_pattern;

// 自定义事件
public class CustomEvent {
    private String message;

    public CustomEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
