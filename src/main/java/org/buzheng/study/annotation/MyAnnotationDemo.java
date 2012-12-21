package org.buzheng.study.annotation;

/*
 * MyAnnotation1 是用于类型级别的
 * MyAnnotation2 是用于方法级别的
 */

@MyAnnotation1("this is annotation1")
public class MyAnnotationDemo {
	
	@MyAnnotation2(description="", isAnnotation=false)
	public void sayHello() {
		System.out.println("hello");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
