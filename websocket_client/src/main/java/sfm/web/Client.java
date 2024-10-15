package sfm.web;

import com.alibaba.fastjson2.JSON;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import thrift_gen.oasis_im.gate_ws.*;
import thrift_gen.oasis_im.rpc.ChatMsg;

import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Client extends WebSocketClient {
    public Client(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        System.out.println("connect server success, " + serverHandshake.getHttpStatusMessage());
    }

    @Override
    public void onMessage(String s) {
        System.out.println("receive message(text): " + s);
//        var msg = JSON.parseObject(s, IMMessage.class);
//        if (msg == null) {
//            System.out.println("Json ");
//            return;
//        }
//        switch (msg.ID) {
//            case PONG -> pong(msg);
//            case GET_NEWEST_SEQ_RESP -> getNewestSeq(msg);
//            case PULL_SESSION_LIST_V2_RESP -> pullSessionList(msg);
//            case SEND_MSG_RESP -> sendMsg(msg);
//            case JOIN_GROUP_PUSH -> joinGroupPush(msg);
//            case USER_MSG -> UserMsg(msg);
//            default -> System.out.println("msg id error");
//        }
    }

    @Override
    public void onMessage(ByteBuffer bytes) {
        byte[] byteArray = new byte[bytes.remaining()];
        bytes.get(byteArray);
        System.out.println("receive message: " + Arrays.toString(byteArray));
//        var msg = JSON.parseObject(byteArray, IMMessage.class);
//        if (msg == null) {
//            System.out.println(Arrays.toString(byteArray));
//            return;
//        }
//        switch (msg.ID) {
//            case PONG -> pong(msg);
//            case GET_NEWEST_SEQ_RESP -> getNewestSeq(msg);
//            case PULL_SESSION_LIST_V2_RESP -> pullSessionList(msg);
//            case SEND_MSG_RESP -> sendMsg(msg);
//            case JOIN_GROUP_PUSH -> joinGroupPush(msg);
//            case USER_MSG -> UserMsg(msg);
//            default -> System.out.println("msg id error");
//        }
    }

    @Override
    public void onClose(int i, String s, boolean b) {
        System.out.println("client close, " + s);
    }

    @Override
    public void onError(Exception e) {
        System.out.println(e.getMessage());
    }

    private void pong(IMMessage msg) {
        var resp = JSON.parseObject(msg.textBody, Pong.class);
        if (resp == null) {
            return;
        }
        System.out.println("pong, msgIncr=" + resp.msgIncr);
    }

    private void getNewestSeq(IMMessage msg) {
        var resp = JSON.parseObject(msg.textBody, GetNewestSeqResp.class);
        if (resp == null) {
            return;
        }
        System.out.println("get_newest_set_resp, msgIncr="+resp.msgIncr+", errCode="+resp.errCode+", errMsg="+resp.errMsg+", seq="+resp.seq);
    }

    private void pullSessionList(IMMessage msg) {
        var resp = JSON.parseObject(msg.textBody, PullSessionListV2Resp.class);
        if (resp == null) {
            return;
        }
        System.out.println("pull_session_list_v2_resp, msgIncr="+resp.msgIncr+", errCode="+resp.errCode+", errMsg="+resp.errMsg);
    }

    private void sendMsg(IMMessage msg) {
        var resp = JSON.parseObject(msg.textBody, SendMsgResp.class);
        if (resp == null) {
            return;
        }
        System.out.println("send_msg_resp, msgIncr="+resp.msgIncr+", errCode="+resp.errCode+", errMsg="+resp.errMsg);
    }

    private void joinGroupPush(IMMessage msg) {
        var resp = JSON.parseObject(msg.textBody, JoinGroupPush.class);
        if (resp == null) {
            return;
        }
        System.out.println("send_msg_resp, data="+resp.data.toString()+", group_id="+resp.data.groupId+", count="+resp.data.memberCount);
    }

    private void UserMsg(IMMessage msg) {
        var resp = JSON.parseObject(msg.textBody, ChatMsg.class);
        if (resp == null) {
            return;
        }
        System.out.println("send_msg_resp, group_id="+resp.recvID+", content="+resp.content);
    }
}
