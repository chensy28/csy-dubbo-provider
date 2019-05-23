package com.csy.netty.relative.test2;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * 事件处理类
 * @author chensy
 * @date 2019-05-23 09:15
 */
public class ServerHandlerTest extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ctx.fireChannelRead(msg);
        System.out.println("接收消息：" + msg);
    }
}
