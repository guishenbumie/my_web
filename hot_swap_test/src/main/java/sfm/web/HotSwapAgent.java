package sfm.web;

import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.lang.instrument.*;
import java.net.URL;
import java.security.ProtectionDomain;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;


/**
 * --gs_base/patches/
 * 热更class文件放在这里
 * 会在执行热更(redefineClasses)之前移动到日期命名的文件夹下（如：gs_base/patch/2020-12-22-17-55-59 ）
 * <p>
 * --gs_base/patches/classpath/
 * 添加到启动classpath里面
 * 热更执行完redefineClasses，会把class文件按照包名复制到这个目录下，以防服务器重启
 * <p>
 * --gs_base/patches/deprecated/
 * 在热更完成，复制class文件的时候，如果classpath下面有之前的同名class文件，会移动到这个目录下
 * <p>
 * <p>
 * TODO 1.热更完成复制移动到classpath路径如果出错，需要手动操作
 * 2.类文件名现在是类全名，如：gs.player.PlayerModule$9.class
 */
public class HotSwapAgent {
    private static final Logger logger = LoggerFactory.getLogger(HotSwapAgent.class);
    public static String BACKUP_ROOT_DIR = "";
    public static final String PATCH_DIR = "patches";
    public static final String PATCH_CLASSPATH_DIR = PATCH_DIR + File.separator + "classpath";
    public static final String PATCH_DEPRECATED_DIR = PATCH_DIR + File.separator + "deprecated";

    private static Instrumentation inst;

    public static void premain(String args, Instrumentation inst) {
//        HotSwapAgent.inst = inst;
        // 注册类转换器
        inst.addTransformer(new ClassFileTransformer() {
            @Override
            public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
                                    ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
                if (className.equals("com.example.MyClass")) {
                    try {
                        // 加载更新后的类字节码
                        File updatedClassFile = new File("path/to/updated/MyClass.class");
                        FileInputStream fis = new FileInputStream(updatedClassFile);
                        byte[] updatedBytes = new byte[(int) updatedClassFile.length()];
                        fis.read(updatedBytes);
                        fis.close();
                        return updatedBytes;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
                return null;
            }
        });
    }

    @Deprecated
    public static String reload(Class<?> cls, File file, int serverId) throws IOException, ClassNotFoundException, UnmodifiableClassException {
        if (inst == null) {
            return "该应用没有添加此特性, 请检查启动参数 javaagent";
        }
        byte[] code = loadBytesFromClassFile(file);
        ClassDefinition def = new ClassDefinition(cls, code);
        inst.redefineClasses(new ClassDefinition[]{def});
        return "<br>[hot swap v2] " + cls.getName() + " reloaded server " + serverId;
    }

    public static String reloadAllClasses(Map<String, File> classFiles, int serverId)
    //throws IOException, ClassNotFoundException, UnmodifiableClassException
    {
        if (inst == null) {
            return "<br>[hot swap v2 FAIL ] 该应用没有添加此特性, 请检查启动参数 javaagent";
        }

        List<ClassDefinition> classDefinitionList = new ArrayList<>();
        String msg;
        for (Map.Entry<String, File> classFileEntry : classFiles.entrySet()) {
            String className = classFileEntry.getKey();
            File classFile = classFileEntry.getValue();
            try {
                Class<?> cls = Class.forName(className);
                byte[] code = loadBytesFromClassFile(classFile);
                ClassDefinition def = new ClassDefinition(cls, code);
                classDefinitionList.add(def);
            } catch (ClassNotFoundException e) {
                msg = "<br>[hot swap v2 FAIL ] class can't found :" + className;
                logger.error(msg, e);
                return msg;
            } catch (IOException e) {
                msg = "<br>[hot swap v2 FAIL ] load class file error : " + classFile.getName();
                logger.error(msg, e);
                return msg;
            }
        }

        try {
            inst.redefineClasses(classDefinitionList.toArray(new ClassDefinition[0]));
        } catch (ClassNotFoundException | UnmodifiableClassException e) {
            msg = "<br>[hot swap v2 FAIL ] redefineClasses fail , " + e.getMessage();
            logger.error(msg, e);
            return msg;
        }

        String successMsg = classDefinitionList.stream()
                .map(classDefinition ->
                        String.format("<br>[hot swap v2 SUCCESS ] %s reloaded server %d",
                                classDefinition.getDefinitionClass().getName(),
                                serverId))
                .collect(Collectors.joining("\r\n"));

        logger.info("[hot swap v2 SUCCESS ] redefineClasses success \n{}", successMsg);

        try {
            onReloadSuccess(classFiles);
            logger.info("[hot swap v2 SUCCESS ] cp class file to classpath success ! ");
        } catch (IOException e) {
            successMsg += "\n\r <br> !!!!! copy patch class to classpath fail !!!!, " + e.getMessage();
            logger.error("[hot swap v2 FAIL ] copy patch class to classpath fail !!!! ", e);
        }

        return successMsg;
    }

    private static byte[] loadBytesFromClassFile(File classFile) throws IOException {
        byte[] buffer = new byte[(int) classFile.length()];
        try (FileInputStream fis = new FileInputStream(classFile); BufferedInputStream bis = new BufferedInputStream(fis)) {
            bis.read(buffer);
        } catch (IOException e) {
            throw e;
        }
        return buffer;
    }

    /**
     * this class loaded by Application Class Loader, can not load extension
     * classes, need extension class loader extends URLClassLoader public static
     * void agentmain(String agentArguments, Instrumentation instrumentation)
     * throws Exception { logger.info(
     * "[hot swap] agentmain method invoked with args: {} and inst: {}",
     * agentArguments, instrumentation); logger.info(
     * "[hot swap] RedefineClasses flag {}, RetransformClasses flag {}",
     * instrumentation.isRedefineClassesSupported(),
     * instrumentation.isRetransformClassesSupported()); Collection
     * <File> patchClassFiles = FileUtils.listFiles(new File(PATCH_DIR), new
     * String[]{"class"}, true); if (patchClassFiles.isEmpty()) { logger.info(
     * "[hot swap] no patch files"); return; } for (File patchFile :
     * patchClassFiles) { String path = patchFile.getPath(); String
     * fullClassName = getFullClassName(path); if
     * (!fullClassName.startsWith(GAME_PACKAGES)) continue; logger.info(
     * "[hot swap] ready redefine file {}, full class name {}", path,
     * fullClassName); byte[] classContents =
     * Files.readAllBytes(Paths.get(path)); ClassDefinition classDefinition =
     * new ClassDefinition(Class.forName(fullClassName), classContents);
     * instrumentation.redefineClasses(classDefinition); logger.info(
     * "[hot swap] finish redefine class {}", fullClassName); } }
     **/
    public static Map<String, File> getFullClassNameFiles() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String strDate = sdf.format(new Date());
        Map<String, File> map = new HashMap<>();
        Collection<File> patchClassFiles = FileUtils.listFiles(new File(PATCH_DIR), new String[]{"class"}, false);
        for (File file : patchClassFiles) {
            String fullClassName = getFullClassName(file);
            if (fullClassName != null) {
                String dirPath = file.getParent() + File.separator + strDate;
                File dir = new File(dirPath);
                if (!dir.exists()) {
                    dir.mkdir();
                }
                File newFile = new File(dirPath + File.separator + file.getName());
                file.renameTo(newFile);
                map.put(fullClassName, newFile);
                logger.info("[hot swap] find class file {} in {}.", fullClassName, PATCH_DIR);
            }
        }
        return map;
    }

    private static String getFullClassName(File file) {
        try (InputStream is = new FileInputStream(file)) {
            ClassReader reader = new ClassReader(is);
            ClassNode node = new ClassNode();
            reader.accept(node, 0);
            return node.name.replace("/", ".");
        } catch (IOException e) {
            logger.error("[hot swap] load file {} package name error", file.getPath());
            return null;
        }
    }


    private static void createDirIfNotExist(String dirPath) {
        File path = new File(dirPath);
        if (!path.exists()) {
            boolean result = path.mkdirs();
            logger.info(" create dir : {}, {}", result, dirPath);
        }
    }

    private static void onReloadSuccess(Map<String, File> classFiles) throws IOException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String strDate = sdf.format(new Date());

        for (Map.Entry<String, File> classFileEntry : classFiles.entrySet()) {
            String fullClassName = classFileEntry.getKey();
            File classFile = classFileEntry.getValue();
            String classFilePath = fullClassName.replace(".", File.separator);
            String packageDir = classFilePath.substring(0, classFilePath.lastIndexOf(File.separator));
            String clzPath = PATCH_CLASSPATH_DIR + File.separator + packageDir;
            createDirIfNotExist(clzPath);

            //TODO 2.类文件名现在是类全名，如：gs.player.PlayerModule$9.class
            String[] split = classFile.getName().split("\\.");
            String targetClassFileName = clzPath + File.separator + split[split.length - 2] + ".class";
            File targetClassFile = new File(targetClassFileName);

            File deprecateFile = null;
            if (targetClassFile.exists()) {
                createDirIfNotExist(PATCH_DEPRECATED_DIR);
                deprecateFile = new File(PATCH_DEPRECATED_DIR + File.separator + classFile.getName() + "_" + strDate);
                boolean mvResult = targetClassFile.renameTo(deprecateFile);
                if (!mvResult) {
                    logger.error(" mv duplicate class file fail : {}, {}", targetClassFile.getAbsolutePath(), deprecateFile.getAbsolutePath());
                }
                targetClassFile = new File(targetClassFileName);
            }

            try {
                Files.copy(classFile, targetClassFile);
                logger.info(" copy class file to class path success \n from:{}, \n to:{}",
                        classFile.getAbsolutePath(), targetClassFile.getAbsolutePath());
            } catch (IOException e) {
                logger.error(" copy class file fail : {}, {}, {}",
                        classFile.getAbsolutePath(), targetClassFile.getAbsolutePath(), deprecateFile, e);
                throw e;
            }
        }

        if (!StringUtils.isEmpty(BACKUP_ROOT_DIR)) {
            // 备份到efs
            String dstClassPath = BACKUP_ROOT_DIR + PATCH_CLASSPATH_DIR;
            backup(PATCH_CLASSPATH_DIR, dstClassPath);
        }
    }

    public static void backup(String srcPath, String dstPath) throws IOException {
        if (StringUtils.isEmpty(BACKUP_ROOT_DIR)) {
            logger.info("skip backup {} {} on empty back root", srcPath, dstPath);
            return;
        }
        File src = new File(srcPath);
        File dst = new File(dstPath);
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
        }
        if (src.isDirectory()) {
            FileUtils.copyDirectory(src, dst);
        } else {
            FileUtils.copyFile(src, dst);
        }
    }

    public static void checkLoadedPatchClass() {

        File patchClassPathDir = new File(PATCH_CLASSPATH_DIR);
        if (!patchClassPathDir.exists()) {
            return;
        }
        Collection<File> patchClassFiles = FileUtils.listFiles(patchClassPathDir, new String[]{"class"}, true);
        if (patchClassFiles.isEmpty()) {
            logger.info("[checkLoadedPatchClass] no hot patch class to load ");
            return;
        }
        logger.info("[checkLoadedPatchClass] has hot patch class to load: \n{}",
                patchClassFiles.stream().map(File::getAbsolutePath).collect(Collectors.joining("\r\n")));
        for (File patchClassFile : patchClassFiles) {
            String fullClassName = getFullClassName(patchClassFile);
            Class<?> cls = null;
            try {
                cls = Class.forName(fullClassName);
            } catch (ClassNotFoundException e) {
                logger.error("[checkLoadedPatchClass] class full name error  : {}", fullClassName, e);
            }
            URL loadPath = cls.getResource("");
            if (!loadPath.getPath().contains(PATCH_CLASSPATH_DIR)) {
                logger.error("[checkLoadedPatchClass] hot patch class load path error : \n class = {}, \n cur = {}, \n need = {}",
                        cls.getName(), loadPath, patchClassFile.getAbsolutePath(), new RuntimeException());
            } else {
                logger.info("[checkLoadedPatchClass] hot patch class load path ok :{}, {}", cls.getName(), loadPath);
            }
        }
    }


}
