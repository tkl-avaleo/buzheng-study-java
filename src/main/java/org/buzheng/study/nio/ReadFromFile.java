package org.buzheng.study.nio;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFromFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("e:\\nio_src.txt");
		
		// 获取通道
		FileChannel fc = fis.getChannel();
		// 建立缓冲区
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		// 将数据从文件读到缓冲区
		fc.read(buffer);
		
		// 将缓冲区的当前指针定位到开始
		buffer.flip();
		
		while (buffer.hasRemaining()) {
			byte b = buffer.get();
			System.out.print((char)b);
		}
		
		fis.close();

	}

}
