package org.buzheng.study.clazz;

public class SuperGetClass {

	public static void main(String[] args) {
		SuperGetClass sgc = new SuperGetClass();
		sgc.test();
	}
	
	public void test() {
		System.out.println(super.getClass().getName());
		System.out.println(this.getClass().getSuperclass().getName());
	}

}
