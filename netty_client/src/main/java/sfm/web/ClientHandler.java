package sfm.web;

import com.google.protobuf.ByteString;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.buffer.ByteBuf;
import msg.gate.CKeyExchange;
import msg.gate.SKeyExchange;

public class ClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

    private Channel channel;
    private NetKey netKey;

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        System.out.println("client channelActive");
        channel = ctx.channel();
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf buff) throws Exception {
        var msgId = buff.readInt();
        System.out.println("client received msg id: " + msgId);
        var seq = buff.readInt();
        switch (msgId) {
            case MsgCodec.MSG_SC_HEARTBEAT -> System.out.println("received heartbeat");
            case MsgCodec.MSG_SC_Connected -> {
                System.out.println("received connected");
                buff.skipBytes(4);
                var needKeyExchange = buff.readBoolean();
                if (needKeyExchange) {
                    netKey = new NetKey(false);
                    byte[] clientPublicKey = netKey.getSelfPublicKey();

//                    var packSize = clientPublicKey.length;
//                    channel.writeAndFlush(MsgCodec.encodeHeader(channel.alloc(), MsgCodec.MSG_CS_KeyExchange, 1, packSize).writeBytes(clientPublicKey))
//                            .addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);

                    var cKeyExchange = CKeyExchange.newBuilder().setClientPublicKey(ByteString.copyFrom(clientPublicKey)).build();
                    var msgBytes = cKeyExchange.toByteArray();
                    var msg = MsgCodec.encodeHeader(channel.alloc(), CKeyExchange.TYPE_ID, 1, msgBytes.length).writeBytes(msgBytes);
                    channel.writeAndFlush(msg).addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
                }
            }
            case SKeyExchange.TYPE_ID -> {
                System.out.println("received key exchange");

//                buff.skipBytes(4);
                var packetSize = buff.readInt();
                byte[] sKeyExchangeBytes = new byte[packetSize];
                buff.readBytes(sKeyExchangeBytes);
                var sKeyExchange = SKeyExchange.parseFrom(sKeyExchangeBytes);

//                var serverPublicKeyLength = buff.readInt();
//                byte[] serverPublicKey = new byte[serverPublicKeyLength];
//                buff.readBytes(serverPublicKey);
//
//                var serverSignatureLength = buff.readInt();
//                byte[] serverSignature = new byte[serverSignatureLength];
//                buff.readBytes(serverSignature);
//
//                var clientReadNonceLength = buff.readInt();
//                byte[] clientReadNonce = new byte[clientReadNonceLength];
//                buff.readBytes(clientReadNonce);
//
//                var clientWriteNonceLength = buff.readInt();
//                byte[] clientWriteNonce = new byte[clientWriteNonceLength];
//                buff.readBytes(clientWriteNonce);

                if (!NetKeyHelper.getInstance().verify(sKeyExchange.getServerPublicKey().toByteArray(), sKeyExchange.getServerSignature().toByteArray())) {
                    System.out.println("verify failed");
                    return;
                }

                var genServerPublicKey = NetKeyHelper.getInstance().generateECPublicKey(sKeyExchange.getServerPublicKey().toByteArray());
                if (genServerPublicKey == null) {
                    System.out.println("generate server public key failed");
                    return;
                }

                if (!netKey.calcSharedSecreteKey(genServerPublicKey)) {
                    System.out.println("calc shared secrete key failed");
                    return;
                }

                SecurityHandler securityHandler = new SecurityHandler();
                securityHandler.setupWriteSecurity(netKey.getSharedSecretKey(), sKeyExchange.getWriteNonce().toByteArray());
                securityHandler.setupReadSecurity(netKey.getSharedSecretKey(), sKeyExchange.getReadNonce().toByteArray());
                channel.pipeline().addBefore("LengthFieldBasedFrameDecoder", "Security", securityHandler);

                var cAuth = MsgCodec.encodeHeader(channel.alloc(), 1103, 2, 0);
                channel.writeAndFlush(cAuth);
            }
            default -> System.out.println("received unknown msg " + msgId + ", seq " + seq);
        }
    }
}
