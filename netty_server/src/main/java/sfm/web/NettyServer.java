package sfm.web;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;

public class NettyServer {
    private static final Logger logger = LoggerFactory.getLogger(NettyServer.class);
    public static void main(String[] args) {

//        logger.info("Starting Netty Server");
        System.out.println("Netty Server started");
        CountDownLatch latch = new CountDownLatch(1);

        //配置服务器的Nio线程服
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap bootstrap = new ServerBootstrap();
            bootstrap.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)//使用TCP连接
                    .option(ChannelOption.SO_BACKLOG, 1024)//BACKLOG用于构造服务器套接字ServerSocket对象，标识当服务器请求处理线程全满时，用于临时存放已完成三次握手的请求队列的最大长度
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            ChannelPipeline pipeline = socketChannel.pipeline();
                            pipeline.addLast(new LengthFieldBasedFrameDecoder(1024 * 1024, 12, 4));
                            pipeline.addLast(new ServerHandler());
                        }
                    });

            ChannelFuture future = bootstrap.bind(12138).sync();

            future.channel().closeFuture().sync();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放线程池资源
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
        logger.info("tgate server started");
        try {
            latch.await();
            logger.info("server stopped");
        } catch (InterruptedException e) {
            logger.error("server stopped", e);
        }
    }
}
