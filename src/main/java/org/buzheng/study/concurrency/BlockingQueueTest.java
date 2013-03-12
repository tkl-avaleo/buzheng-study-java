package org.buzheng.study.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
	
	static BlockingQueue<String> basket;
	public BlockingQueueTest() {
		basket = new ArrayBlockingQueue<String>(2);
	}
	
	class Producer implements Runnable {

		@Override
		public void run() {
			while (true) {
				try {
					basket.put("An Apple");
					System.out.println("put one");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	class Consumer implements Runnable {

		@Override
		public void run() {
			while (true) {
				try {
					basket.take();
					System.out.println("take one");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public void execute() {
		for (int i = 0; i < 10; i++) {
			new Thread(new Producer()).start();
			new Thread(new Consumer()).start();
		}
	}

	public static void main(String[] args) {
		System.out.println("=========================");
		BlockingQueueTest test = new BlockingQueueTest();
		test.execute();
	}

}
