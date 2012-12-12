package org.buzheng.study.pattern.proxy;

public class HelloStaticProxy implements IHello {
	
	private IHello hello;

	public HelloStaticProxy(IHello hello) {
		super();
		this.hello = hello;
	}

	public void sayHello(String name) {
		System.out.println("start hello.....");
		hello.sayHello(name);
		System.out.println("end hello.....");
	}
	
	public static void main(String[] as) {
		IHello helloProxy = new HelloStaticProxy(new HelloSpeaker());
		helloProxy.sayHello("buzheng");
	}
}
