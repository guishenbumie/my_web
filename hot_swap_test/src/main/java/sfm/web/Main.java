package sfm.web;

import java.util.concurrent.CountDownLatch;

public class Main {
    private static CountDownLatch latch;

    public static void main(String[] args) {
        latch = new CountDownLatch(1);

        new WebService().start();

        var p = new Person("tom", 20);
        System.out.println("My name is " + p.getName());
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}