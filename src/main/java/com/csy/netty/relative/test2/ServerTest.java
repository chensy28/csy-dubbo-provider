package com.csy.netty.relative.test2;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * Netty 服务端自测
 * @author chensy
 * @date 2019-05-23 09:10
 */
public class ServerTest {
    public static void main(String[] args) {
        int port = 7788;
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workGroup = new NioEventLoopGroup();
        ServerBootstrap bs = new ServerBootstrap();
        bs.group(bossGroup, workGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ServerHandlerTest())
                .bind(port);

    }
}
