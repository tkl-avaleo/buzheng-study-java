package org.buzheng.study.nio.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NioSocketServer {

	private Selector selector;
	
	public void initServer(int port) throws IOException {
		// 获取 Server Socket 通道
		ServerSocketChannel serverChannel = ServerSocketChannel.open();
		// 设置 非阻塞
		serverChannel.configureBlocking(false);
		// 绑定到端口
		serverChannel.socket().bind(new InetSocketAddress(port));
		// 通告管理器
		this.selector = Selector.open();
		// 绑定通道管理器和通道，并在该通道上注册 SelectionKey.OP_ACCEPT 事件。
		serverChannel.register(selector, SelectionKey.OP_ACCEPT);
	}
	
	/**
	 * 轮询侦听selector上是否有需要处理的事件，如果有则进行处理
	 * @throws IOException
	 */
	public void listen() throws IOException {
		while (true) {
			
			this.selector.select();
			
			Set<SelectionKey> selectionKeys = this.selector.selectedKeys();
			Iterator<SelectionKey> iterator = selectionKeys.iterator();
			
			while (iterator.hasNext()) {
				SelectionKey key = iterator.next();
				iterator.remove();
				
				if (key.isAcceptable()) {
					ServerSocketChannel server = (ServerSocketChannel) key.channel();
					SocketChannel channel = server.accept();
					
					channel.configureBlocking(false);
					
					channel.write(ByteBuffer.wrap("向客户端发送了一条信息".getBytes()));
					
					channel.register(this.selector, SelectionKey.OP_READ);
				} else if (key.isReadable()) {
					read(key);
				}
			}
		}
	}
	
	public void read(SelectionKey key) throws IOException {
		SocketChannel channel = (SocketChannel) key.channel();
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		channel.read(buffer);
		
		byte[] data = buffer.array();
		String msg = new String(data).trim();
		System.out.println("服务端收到信息：" + msg);
		
		ByteBuffer outBuffer = ByteBuffer.wrap(msg.getBytes());
		channel.write(outBuffer);
	}

	public static void main(String[] args) throws IOException {
		NioSocketServer server = new NioSocketServer();
		server.initServer(8000);
		System.out.println("服务端启动成功");
		server.listen();
	}

}
