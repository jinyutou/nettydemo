package demo;

import java.util.Date;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

public class ObjectServerHandler extends SimpleChannelHandler {
	/**
     * �����ܵ���Ϣ��ʱ�򴥷�
     */
    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e)
            throws Exception {
        Command command = (Command) e.getMessage();
        // ��ӡ�����ǲ������ǸղŴ��������Ǹ�
        System.out.println(new Date()+"===���ѳɹ��Ľ��յ������Ϣ��====>"+command.getActionName());
    }
}
