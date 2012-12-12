package org.buzheng.study.nio;

import java.nio.ByteBuffer;

public class TestReadOnlyBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ByteBuffer buffer = ByteBuffer.allocate(10);

		// 缓冲区中的数据0-9
		for (int i = 0; i < buffer.capacity(); ++i) {
			buffer.put((byte) i);
		}

		ByteBuffer readonly = buffer.asReadOnlyBuffer();

		for (int i = 0; i < buffer.capacity(); i++) {
			byte b = buffer.get(i);
			b *= 10;
			buffer.put(i, b);
		}
		
//		for (int i = 0; i < readonly.capacity(); i++) {
//			byte b = readonly.get(i);
//			b *= 10;
//			readonly.put(i, b);
//		}

		readonly.position(0);
		readonly.limit(buffer.capacity());

		// 只读缓冲区的内容也随之改变
		while (readonly.remaining() > 0) {
			System.out.println(readonly.get());
		}
	}

}
