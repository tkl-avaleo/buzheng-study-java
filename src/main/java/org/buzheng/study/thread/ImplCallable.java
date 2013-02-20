package org.buzheng.study.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ImplCallable {

	public static void main(String[] args) {
		Callable<Integer> aCallable = new CallableImpl();
		FutureTask<Integer> aTask = new FutureTask<Integer>(aCallable);
		
		Thread t = new Thread(aTask);
		t.start();
		
	}

}

class CallableImpl implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		System.out.println("start...");
		return 1;
	}
	
}