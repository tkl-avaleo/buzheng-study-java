package org.buzheng.study.concurrency;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Pool aPool = new Pool(2);
		Runnable worker = new Runnable() {
			public void run() {
				String resource = null;
				try {
					// 取得resource
					resource = aPool.get();
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				
				// 使用 resource
				System.out.println("I worked on " + resource);
				
				// 归还 resource
				aPool.put(resource);
			}
		};
		
		ExecutorService service = Executors.newCachedThreadPool();
		for (int i = 0; i < 20; i++) {
			service.submit(worker);
		}
		
		service.shutdown();
	}

}

class Pool {
	ArrayList<String> pool = null;
	Semaphore pass = null;
	
	public Pool(int size) {
		pool = new ArrayList<String>();
		for (int i = 0; i < size; i++) {
			pool.add("Resource: " + i);
		}
		
		// semaphore的大小和资源池一样
		pass = new Semaphore(size);
	}
	
	public String get() throws InterruptedException {
		pass.acquire();
		return getResource();
	}
	
	public void put(String resource) {
		pass.release();
		releaseResource(resource);
	}
	
	private synchronized String getResource() {
		String result = pool.get(0);
		pool.remove(0);
		System.out.println("Give out " + result);
		return result;
	}
	
	private synchronized void releaseResource(String resource) {
		System.out.println("return " + resource);
		pool.add(resource);
	}
	
}