package org.buzheng.study.concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchTester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Server is starting");
		
		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		service.submit(new ComponentThread(latch, 1));
		service.submit(new ComponentThread(latch, 2));
		service.submit(new ComponentThread(latch, 3));
		
		service.shutdown();

		latch.await();
		
		System.out.println("Server is up.");
	}

}

class ComponentThread implements Runnable {
	
	CountDownLatch latch;
	int ID;
	
	public ComponentThread(CountDownLatch latch, int ID) {
		this.latch = latch;
		this.ID = ID;
	}

	@Override
	public void run() {
		long time = ((int)(Math.random()*10)) * 1000;
		System.out.println("Component " + this.ID + " initializing, need " + time + " mills");
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Component " + this.ID + " initialized");
		latch.countDown();
	}
	
}