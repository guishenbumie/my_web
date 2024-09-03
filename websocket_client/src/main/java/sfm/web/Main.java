package sfm.web;

import java.net.URI;
import java.util.Scanner;

public class Main {
    private final static String HOST = "oasis-st-im-sandbox.dailygn.com";

    public static void main(String[] args) throws Exception {
//        var uid = "83323837712140291";
//        var token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVSUQiOiI4MzMyMzgzNzcxMjE0MDI5MSIsIlBsYXRmb3JtIjoiIiwiZXhwIjoxNzI1OTQwNjU1LCJpYXQiOjE3MjUzMzU4NTUsIm5iZiI6MTcyNTMzNTg1NX0.wtRwE4rJcsrMertjdQfYaujwfxtbheTUW46SVjTZjz8";
//        var url = STR."ws://\{HOST}/?sendID=\{uid}&platformID=3&Token=\{token}&ServerID=10001&MsgType=1";
        var url = "ws://localhost:8887";
        System.out.println(url);
        var client = new Client(new URI(url));
        client.connect();

        var scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.print("Enter a value: ");
            String input = scanner.nextLine();
            System.out.println(STR."You entered: \{input}");
            if (input.equals("exit")) {
                exit = true;
            } else {
                client.send(input);
                Thread.sleep(1000);
            }
        }
        scanner.close();
    }
}