package org.buzheng.study.nio;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class WriteToFile {
	
//	static private final byte message[] = { 83, 111, 109, 101, 32,  
//        98, 121, 116, 101, 115, 46 };
	
	private final static String message = "some message who will be writen.";

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("e:\\nio_dest.txt");
		
		// 获取通道
		FileChannel channel = fos.getChannel();
		
		// 建立缓冲区
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		
		// 将数据写入缓冲区
//		for (int i = 0; i < message.length; i++) {
//			buffer.put(message[i]);
//		}
		
		buffer.put(message.getBytes());
		
		// 写入前一定要将位置指针重置到缓冲区最前
		buffer.flip();
		
		// 将缓冲区的数据通过通道写入文件
		channel.write(buffer);
		
		fos.close();
		
	}

}
