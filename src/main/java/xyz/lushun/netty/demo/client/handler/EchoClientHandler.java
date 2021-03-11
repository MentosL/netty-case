package xyz.lushun.netty.demo.client.handler;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;

import java.util.concurrent.TimeUnit;

/**
 * @author Montos
 * @create 2021/3/11 5:00 下午
 */
public class EchoClientHandler implements ChannelInboundHandler {

    private final ByteBuf firstMessage;

    public EchoClientHandler() {
        this.firstMessage = Unpooled.wrappedBuffer("I am echo message".getBytes());
    }

    @Override
    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        channelHandlerContext.writeAndFlush(firstMessage);
    }


    @Override
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {
        channelHandlerContext.write(o);
    }



    @Override
    public void channelReadComplete(ChannelHandlerContext channelHandlerContext) throws Exception {
        TimeUnit.SECONDS.sleep(3);
        channelHandlerContext.flush();
    }

    @Override
    public void channelRegistered(ChannelHandlerContext channelHandlerContext) throws Exception {

    }

    @Override
    public void channelUnregistered(ChannelHandlerContext channelHandlerContext) throws Exception {

    }


    @Override
    public void channelInactive(ChannelHandlerContext channelHandlerContext) throws Exception {

    }



    @Override
    public void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {

    }

    @Override
    public void channelWritabilityChanged(ChannelHandlerContext channelHandlerContext) throws Exception {

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {

    }

    @Override
    public void handlerAdded(ChannelHandlerContext channelHandlerContext) throws Exception {

    }

    @Override
    public void handlerRemoved(ChannelHandlerContext channelHandlerContext) throws Exception {

    }
}
