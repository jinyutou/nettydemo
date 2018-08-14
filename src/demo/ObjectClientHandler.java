package demo;

import java.util.Date;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

public class ObjectClientHandler extends SimpleChannelHandler {
	/**
     * 当绑定到服务端的时候触发，给服务端发消息。
     *
     * @author lihzh
     * @alia OneCoder
     */
    @Override
    public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) {
        // 向服务端发送Object信息
    	System.out.println("============开始发送消息===========>"+new Date());
        sendObject(e.getChannel());
    }
 
    /**
     * 发送Object
     *
     * @param channel
     * @author lihzh
     * @alia OneCoder
     */
    private void sendObject(Channel channel) {
        Command command =new Command();
        command.setActionName("Hello action.");
        channel.write(command);
        System.out.println("============消息已发送===========>"+new Date());
    }
}
