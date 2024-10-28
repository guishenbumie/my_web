package sfm.web;

import java.util.regex.Pattern;

public class PatternTest {
    public static final Pattern CHAR_PATTERN = Pattern.compile("[~`!@#$%^&*()_\\-+={\\[}\\]|\\\\:;\"'<,>.?/]");//不能包含这里的字符
    public static final Pattern PREFIX_PATTERN = Pattern.compile("^[^0-9].{0,40}$");//不能以这里的字符为开头

    private static boolean pass(String name) {
        return !CHAR_PATTERN.matcher(name).find() && PREFIX_PATTERN.matcher(name).matches();
    }

    public static void main(String[] args) {
        System.out.println(" " + "\t" + "false" + "\t" + pass(" "));
        System.out.println("123" + "\t" + "false" + "\t" + pass("123"));
        System.out.println("abc" + "\t" + "true" + "\t" + pass("abc"));
        System.out.println("!sdb" + "\t" + "false" + "\t" + pass("!sdb"));
        System.out.println("s%db" + "\t" + "false" + "\t" + pass("s%db"));
        System.out.println("sdb！" + "\t" + "true" + "\t" + pass("sdb！"));
        System.out.println("sd b" + "\t" + "false" + "\t" + pass("sd b"));
    }
}
