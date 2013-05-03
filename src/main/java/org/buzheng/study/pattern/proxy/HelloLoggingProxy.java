package org.buzheng.study.pattern.proxy;

public class HelloLoggingProxy implements IHello {
	
	private IHello hello;

	public HelloLoggingProxy(IHello hello) {
		super();
		this.hello = hello;
	}

	public void sayHello(String name) {
		System.out.println("start hello.....");
		hello.sayHello(name);
		System.out.println("end hello.....");
	}
	
	public static void main(String[] as) {
		IHello helloProxy = new HelloLoggingProxy(new HelloSpeaker());
		helloProxy.sayHello("buzheng");
	}
}
