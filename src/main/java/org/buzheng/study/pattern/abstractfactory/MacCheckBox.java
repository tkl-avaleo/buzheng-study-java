package org.buzheng.study.pattern.abstractfactory;

public class MacCheckBox implements CheckBox {

	@Override
	public void paint() {
		System.out.println("paint mac style checkbox");
	}

}
