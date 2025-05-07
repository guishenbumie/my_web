package sfm.web;

import sfm.web.hotswap.HotSwapV2;
import java.util.Scanner;

public class Main {

//    private static CountDownLatch latch;

    public static void main(String[] args) {
        var s = "a.data";
        System.out.println(s.substring(0, s.length() - 5));
        var p = new Person("tom", 10);
        System.out.println("Hello world!" + p.getName());
//        latch = new CountDownLatch(1);
        var scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            var input = scanner.nextLine();
            if (input.equals("0")) {
                exit = true;
            } else if (input.equals("reload")) {
                reload();
            } else {
                System.out.println(p.getName());
            }
        }
    }

    private static void reload() {
        System.out.println("reload...");
        var res = HotSwapV2.reloadAllClass(0);
        System.out.println(res);
    }
}