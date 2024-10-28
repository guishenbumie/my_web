package sfm.web.annotation;

public enum EEvent {
    INIT(0),
    RELOAD(1),
    ;

    private final int id;
    EEvent(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
