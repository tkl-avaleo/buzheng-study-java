package org.buzheng.study.clazz;

public class ClassA {

	public ClassA() {
		System.out.println("creating ClassA");
	}

	static {
		System.out.println("This is an static code segment.");
	}

	public static void main(String[] args) throws Exception {
//		Class.forName("org.buzheng.study.clazz.ClassA").newInstance();
		ClassA a = new ClassA();
	}

}
