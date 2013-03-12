package org.buzheng.study.concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Basket {

	Lock lock = new ReentrantLock();
	
	Condition produced = lock.newCondition();
	Condition consumed = lock.newCondition();
	
	boolean available = false;

	public void produce() throws InterruptedException {
		lock.lock();
		try {
			if (available) {
				System.out.println("========================");
				// 放弃Lock进入睡眠
				consumed.await();
			}
			
			// 生产苹果
			System.out.println("Apple produced");
			
			available = true;
			
			// 发信号唤醒等待这个Condition的线程
			produced.signal();
			
		} finally {
			lock.unlock();
		}
	}
	
	public void consume() throws InterruptedException {
		lock.lock();
		try {
			if (! available) {
				// 放弃等待进入睡眠
				produced.await();
			}
			
			// 吃苹果
			System.out.println("App consumed"); 
			available = false;
			
			// 发信号唤醒等待这个条件的线程
			consumed.signal();
		} finally {
			lock.unlock();
		}
	}
	
}
