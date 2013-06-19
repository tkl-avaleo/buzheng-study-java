package org.buzheng.study.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class LoggingDynamicProxy implements InvocationHandler {
	
	private Object delegate;
	
	public Object bind(Object delegate) {
		this.delegate = delegate;
		Class clazz = delegate.getClass();
		
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {		
		Object result = null;
		
		System.out.println("method start.......");
		System.out.println(this.delegate.getClass());
		System.out.println(proxy.getClass());
		System.out.println("method name: " + method.getName());
		System.out.println("method args: " + Arrays.toString(args));
		result = method.invoke(delegate, args);
		System.out.println("end start.......");
		
		
		return result;
	}

	public static void main(String[] args) {
		IHello helloProxy = (IHello) new LoggingDynamicProxy().bind(new HelloSpeaker());
		helloProxy.sayHello("buzheng");
		
		IBye byeProxy = (IBye) new LoggingDynamicProxy().bind(new ByeSpeaker());
		byeProxy.sayBye("buzheng");
	}
}
