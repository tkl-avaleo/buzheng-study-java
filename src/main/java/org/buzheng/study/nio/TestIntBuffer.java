package org.buzheng.study.nio;

import java.nio.IntBuffer;

public class TestIntBuffer {
	
	public static void main(String[] args) {
		IntBuffer buffer = IntBuffer.allocate(8);
		
		for (int i = 0; i < buffer.capacity(); i++) {
			int j = 2 * (i+1);
			buffer.put(j);
		}
		
		System.out.println(buffer);
		
		buffer.flip();		

		System.out.println(buffer);
		
		while (buffer.hasRemaining()) {
			int j = buffer.get();
			System.out.println(j + " ");
			System.out.println(buffer);
		}
	}
	
}
