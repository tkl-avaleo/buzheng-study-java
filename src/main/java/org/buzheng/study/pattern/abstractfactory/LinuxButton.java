package org.buzheng.study.pattern.abstractfactory;

public class LinuxButton implements Button {

	@Override
	public void paint() {
		System.out.println("paint linux style button");
	}

}
