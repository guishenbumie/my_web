package sfm.web;

public enum EReloadType {
    CFG("cfg"),         //热更策划表
    CLZ("clz")          //热更代码
    ;

    private final String name;

    EReloadType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
