package sfm.web;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        int port = 8887; // 843 flash policy port

        var s = new Server(port);
        s.start();
        System.out.println(STR."ChatServer started on port: \{s.getPort()}");

        var sysin = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String in = sysin.readLine();
            s.broadcast(in);
            if (in.equals("exit")) {
                s.stop(1000);
                break;
            }
        }
    }
}