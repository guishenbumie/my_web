package sfm.web;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

public class NettyClient {
    public static void main(String[] args) {
        var keyPair = NetKeyHelper.getInstance().genRsaKeyPair();
        if (keyPair == null) {
            System.out.println("genRsaKeyPair() failed");
            return;
        } else {
            System.out.println("genRsaKeyPair() success");
            System.out.println("RsaPrivateKey: " + keyPair.getLeft());
            System.out.println("RsaPublicKey: " + keyPair.getRight());
        }
        NetKeyHelper.getInstance().init();

        //配置客户端Nio线程组
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group)
                    .channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            ChannelPipeline pipeline = socketChannel.pipeline();
                            pipeline.addLast("LengthFieldBasedFrameDecoder", new LengthFieldBasedFrameDecoder(1024 * 1024, 8, 4));
                            pipeline.addLast(new ClientHandler());
                        }
                    });

            //发起异步连接
            ChannelFuture future = bootstrap.connect("localhost", 12001).sync();

            //等待客户端链路关闭
            future.channel().closeFuture().sync();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //释放nio线程组
            group.shutdownGracefully();
        }
    }
}