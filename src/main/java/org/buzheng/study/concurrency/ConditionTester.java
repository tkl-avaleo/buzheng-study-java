package org.buzheng.study.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConditionTester {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		final Basket basket = new Basket();
		
		// 定义一个Producer
		Runnable producer = new Runnable() {
			public void run() {
				try {
					basket.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		// 定义一个Consumer
		Runnable consumer = new Runnable() {

			@Override
			public void run() {
				try {
					basket.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		};
		
		ExecutorService service = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			service.submit(consumer);
		}
		
		Thread.sleep(2000);
		
		for (int i = 0; i < 10; i++) {
			service.submit(producer);
		}
		
		service.shutdown();
	}

}
