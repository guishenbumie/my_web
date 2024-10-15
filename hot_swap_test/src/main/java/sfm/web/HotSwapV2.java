package sfm.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.lang.instrument.UnmodifiableClassException;
import java.util.Map;
import java.util.Map.Entry;

public final class HotSwapV2 {
    private static final Logger logger = LoggerFactory.getLogger(HotSwapV2.class);

    private HotSwapV2() {
    }

    public static String reloadAllClass(int serverId) {
        String msg;
        try {
            // full class name -> file path
            Map<String, File> files = HotSwapAgent.getFullClassNameFiles();
            if (files.isEmpty()) {
                msg = "<br>[hot swap v2 FAIL ] can't find class files in patches";
                logger.error(msg);
                return msg;
            }

            msg = HotSwapAgent.reloadAllClasses(files, serverId);
            logger.info("{} ", msg);
            return msg;
        } catch (Exception e) {
            msg = "<br>[hot swap v2 FAIL ] reloadAllClass fail " + e.getMessage();
            logger.error("{}", msg, e);
            return msg;
        }
    }

    @Deprecated
    public static String reloadClass(int serverId) {
        StringBuilder sb = new StringBuilder();
        Entry<String, File> reloadFile = null;
        try {
            // full class name -> file path
            Map<String, File> files = HotSwapAgent.getFullClassNameFiles();
            if (files.isEmpty()) {
                String msg = "can't find class files in patches";
                logger.error(msg);
                return msg;
            }
            for (Entry<String, File> en : files.entrySet()) {
                String className = en.getKey();
                reloadFile = en;
                if (en.getValue().exists()) {
                    sb.append(reload(en.getValue(), className, serverId));
                    sb.append("\r\n");
                }
            }
        } catch (Exception e) {
            sb.append(e.getMessage())
                    .append(", error file = ")
                    .append(reloadFile);
        }
        logger.info("{} ", sb);
        return sb.toString();
    }

    @Deprecated
    private static String reload(File file, String className, int serverId) {
        String msg;
        try {
            Class<?> cls = Class.forName(className);
            return HotSwapAgent.reload(cls, file, serverId);
        } catch (IOException e) {
            msg = "<br>[hot swap v2] load class file error : " + file.getName();
            logger.error(msg, e);
        } catch (UnmodifiableClassException e) {
            msg = "<br>[hot swap v2] class is unmodifiable :" + className;
            logger.error(msg, e);
        } catch (ClassNotFoundException e) {
            msg = "<br>[hot swap v2] class can't found :" + className;
            logger.error(msg, e);
        }

        return msg + " server " + serverId;
    }
}
