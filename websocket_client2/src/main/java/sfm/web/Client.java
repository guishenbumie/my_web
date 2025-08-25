package sfm.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.websocket.*;
import thrift_gen.oasis_im.gate_ws.GetNewestSeqResp;
import thrift_gen.oasis_im.gate_ws.IMMessage;
import thrift_gen.oasis_im.gate_ws.Pong;
import thrift_gen.oasis_im.gate_ws.PullSessionListV2Resp;

import java.io.IOException;
import java.net.URI;


@ClientEndpoint
public class Client {
    Session session = null;

    public Client(URI endpointURI) {
        try {
            session = ContainerProvider.getWebSocketContainer().connectToServer(this, endpointURI);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("连接websocket成功执行");
        this.session = session;
    }

    @OnError
    public void onError(Throwable t) {
        System.out.println("websocket连接发生异常执行, " + t.getMessage());
    }

    @OnMessage
    public void onMessage(String input) {
        IMMessage msg = null;
        try {
            msg = new ObjectMapper().readValue(input, IMMessage.class);
            if (msg == null) {
                return;
            }
            switch (msg.ID) {
                case PONG -> pong(msg);
                case PULL_SESSION_LIST_V2_RESP -> pullSessionList(msg);
                case GET_NEWEST_SEQ_RESP -> getNewestSeq(msg);
                default -> System.out.println("msg id error");
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendMessage(String message) {
        try {
            this.session.getBasicRemote().sendText(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void pong(IMMessage msg) throws JsonProcessingException {
        var resp = new ObjectMapper().readValue(msg.textBody, Pong.class);
        if (resp == null) {
            return;
        }
        System.out.println("receive pong, msgIncr=" + resp.msgIncr);
    }

    private void pullSessionList(IMMessage msg) throws JsonProcessingException {
        var resp = new ObjectMapper().readValue(msg.textBody, PullSessionListV2Resp.class);
        if (resp == null) {
            return;
        }
        System.out.println("pull_session_list_v2_resp, msgIncr=" + resp.msgIncr + ", errCode=" + resp.errCode + ", errMsg=" + resp.errMsg);
    }

    private void getNewestSeq(IMMessage msg) throws JsonProcessingException {
        var resp = new ObjectMapper().readValue(msg.textBody, GetNewestSeqResp.class);
        if (resp == null) {
            return;
        }
        System.out.println("get_newest_set_resp, msgIncr=" + resp.msgIncr + ", errCode=" + resp.errCode + ", errMsg=" + resp.errMsg + ", seq=" + resp.seq);
    }
}
