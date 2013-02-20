package org.buzheng.study.thread;

public class ImplRunnable {

	public static void main(String[] args) {
		Thread t = new Thread(new RunnableImpl());
		t.start();
	}

}


class RunnableImpl implements Runnable {

	@Override
	public void run() {
		System.out.println("start.....");
	}
	
}