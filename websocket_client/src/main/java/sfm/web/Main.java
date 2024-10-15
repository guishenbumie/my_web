package sfm.web;

import thrift_gen.oasis_im.gate_ws.*;
import thrift_gen.oasis_im.rpc.CONTENT_TYPE;
import thrift_gen.oasis_im.rpc.CreateGroup;
import thrift_gen.oasis_im.rpc.MSG_FROM;
import thrift_gen.oasis_im.rpc.SESSION_TYPE;

import java.net.URI;
import java.util.Scanner;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Main {
    private final static String HOST = "oasis-st-im-sandbox.dailygn.com";

    public final static String UID = "164390447481253902";
    public final static String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVSUQiOiIxNjQzOTA0NDc0ODEyNTM5MDIiLCJQbGF0Zm9ybSI6IiIsImV4cCI6MTcyOTE0ODE3MSwiaWF0IjoxNzI4NTQzMzcxLCJuYmYiOjE3Mjg1NDMzNzF9.NSUJQNAKgN6MT4c_1-GtCPEXasvYGYmm3_smRnJzLFg";
    public final static String GROUP_ID = "";

    private static Client client;

    public static void main(String[] args) throws Exception {
        var url = "wss://"+HOST+"/websocket?sendID="+UID+"&platformID=3&Token="+TOKEN+"&ServerID=10001&MsgType=1";
//        var url = "ws://localhost:8887";
        System.out.println(url);
        client = new Client(new URI(url));
        if (!client.connectBlocking(30, TimeUnit.SECONDS)) {
            System.out.println("connect server timeout!!!");
        }

//        var s = "{\"ID\":116,\"textBody\":\"{\\\"header\\\":{\\\"operationID\\\":\\\"8ad89d0f-c1b3-479d-9838-a49dd7bc7414\\\",\\\"msgIncr\\\":1}}\"}";
//        var s = "{\"ID\":100}";
//        var t = JSON.parseObject(s, IMMessage.class);

        var scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("1:PING  100:GET_NEWEST_SEQ_REQ  116:PULL_SESSION_LIST_V2_REQ  104:SEND_MSG_REQ  201:CREATE_GROUP_REQ");
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
                    case GET_NEWEST_SEQ_REQ -> getNewestSeq();
                    case PULL_SESSION_LIST_V2_REQ -> pullSessionList();
                    case SEND_MSG_REQ -> sendMsg();
                    case CREATE_GROUP_REQ -> createGroup();
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
            client.send(text);
        } catch (Exception e) {
            System.out.println("TTransportException, e=" + e.getMessage());
        }
    }

    private static void createGroup() {
        try {
            var uuid = UUID.randomUUID();
            var header = new Header(uuid.toString(), 1);
            var group = new CreateGroup();
            group.groupName = "team_chat_" + UID;
            group.groupType = "team";
            group.serverID = "10001";
            group.ownerUid = UID;
            var req = new CreateGroupReq(header, group);
            var reqStr = JsonUtils.toString(req);
            var msg = new IMMessage(MSGID.CREATE_GROUP_REQ, null, reqStr);
            var text = JsonUtils.toString(msg);
            System.out.println(text);
            client.send(text);
        } catch (Exception e) {
            System.out.println("TTransportException, e=" + e.getMessage());
        }
    }

    private static void getNewestSeq() {
        try {
            var uuid = UUID.randomUUID();
            var header = new Header(uuid.toString(), 1);
            var req = new GetNewestSeqReq(header, SESSION_TYPE.GROUP_CHAT, GROUP_ID);
            var reqStr = JsonUtils.toString(req);
            var msg = new IMMessage(MSGID.GET_NEWEST_SEQ_REQ, null, reqStr);
            var text = JsonUtils.toString(msg);
            System.out.println(text);
            client.send(text);
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
            client.send(text);
        } catch (Exception e) {
            System.out.println("TTransportException, e=" + e.getMessage());
        }
    }

    private static void sendMsg() {
        try {
            var uuid = UUID.randomUUID();
            var header = new Header(uuid.toString(), 1);
            var req = new SendMsgReq();
            req.header = header;
            req.platformID = 3;
            req.recvID = GROUP_ID;
            req.sessionType = SESSION_TYPE.GROUP_CHAT;
            req.msgFrom = MSG_FROM.USER;
            req.contentType = CONTENT_TYPE.Text;
            req.content = "woshiceshi";
            req.clientMsgID = uuid.toString();
            var reqStr = JsonUtils.toString(req);
            var msg = new IMMessage(MSGID.SEND_MSG_REQ, null, reqStr);
            var text = JsonUtils.toString(msg);
            System.out.println(text);
            client.send(text);
        } catch (Exception e) {
            System.out.println("TTransportException, e=" + e.getMessage());
        }
    }
}