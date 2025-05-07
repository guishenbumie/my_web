package sfm.web.annotation_listen;

public class ItemModule {
    @ReloadOnCfgChange(cfgClz = {Test.class}, moduleClz = ItemModule.class)
    public void test() {
        new Test();
        System.out.println("test");
    }
}
