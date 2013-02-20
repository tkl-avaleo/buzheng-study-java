package org.buzheng.study.thread;

public class ExtendsTread {
	
	public static void main(String[] args) {
		
		Thread t = new ConcreteThread();
		t.start();
		
	}
	
}


class ConcreteThread extends Thread {

	@Override
	public void run() {
		super.run();
		System.out.println("thread start.....");
	}
	
}