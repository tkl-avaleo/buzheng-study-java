package org.buzheng.study.pattern.abstractfactory;

public class MacButton implements Button {

	@Override
	public void paint() {
		System.out.println("paint mac style button");
	}

}
