package sfm.web.annotation_listen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ReloadOnCfgChange {
    Class<?>[] cfgClz();
    Class<?> moduleClz();
}
