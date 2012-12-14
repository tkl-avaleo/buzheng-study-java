package org.buzheng.study.pattern.abstractfactory;

public class WindowCheckBox implements CheckBox {

	@Override
	public void paint() {
		System.out.println("paint window style checkbox");
	}

}
