package org.buzheng.study.pattern.abstractfactory;

public class WindowButton implements Button {

	@Override
	public void paint() {
		System.out.println("paint window style button");
	}

}
