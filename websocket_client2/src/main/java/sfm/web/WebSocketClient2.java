package sfm.web;

import thrift_gen.oasis_im.gate_ws.*;

import java.net.URI;
import java.util.Scanner;
import java.util.UUID;

public class WebSocketClient2 {
    private final static String HOST = "oasis-st-im.bytedgame.com";

    private static Client client;

    public static void main(String[] args) throws Exception {
        var uid = "83323837712140291";
        var token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVSUQiOiIzNzQ3NTc4ODc4MTAzNTg2MzExIiwiUGxhdGZvcm0iOiIiLCJleHAiOjE3NTI1NzA3NzksImlhdCI6MTc1MTk2NTk3OSwibmJmIjoxNzUxOTY1OTc5fQ.YCUCauRpN20Gbm42E6bz9KLm2euHO1BMiZSWzTvdDr0";
        var url = "wss://" + HOST + "/websocket?sendID=" + uid + "&platformID=3&Token=" + token + "&ServerID=10001&MsgType=1";
        client = new Client(new URI(url));

        var scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("1:ping  2:");
            System.out.print("Enter a value: ");
            String input = scanner.nextLine();
            System.out.println("You entered: " + input);
            if (input.equals("0")) {
                exit = true;
            } else {
                var msgID = MSGID.findByValue(Integer.parseInt(input));
                if (msgID == null) {
                    System.out.println("Invalid input");
                    continue;
                }
                switch (msgID) {
                    case PING -> ping();
                    case PULL_SESSION_LIST_V2_REQ -> pullSessionList();
                    default -> System.out.println("Invalid input");
                }
                Thread.sleep(1000);
            }
        }
        scanner.close();
    }

    private static void ping() {
        try {
            var uuid = UUID.randomUUID();
            var header = new Header(uuid.toString(), 1);
            var req = new Ping(header);
            var reqStr = JsonUtils.toString(req);
            var msg = new IMMessage(MSGID.PING, null, reqStr);
            var text = JsonUtils.toString(msg);
            System.out.println(text);
            client.sendMessage(text);
        } catch (Exception e) {
            System.out.println("TTransportException, e=" + e.getMessage());
        }
    }

    private static void pullSessionList() {
        try {
            var uuid = UUID.randomUUID();
            var header = new Header(uuid.toString(), 1);
            var req = new PullSessionListV2Req(header);
            var reqStr = JsonUtils.toString(req);
            var msg = new IMMessage(MSGID.PULL_SESSION_LIST_V2_REQ, null, reqStr);
            var text = JsonUtils.toString(msg);
            System.out.println(text);
            client.sendMessage(text);
        } catch (Exception e) {
            System.out.println("TTransportException, e=" + e.getMessage());
        }
    }
}