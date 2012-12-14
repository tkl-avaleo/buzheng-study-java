package org.buzheng.study.pattern.abstractfactory;

public class LinuxCheckBox implements CheckBox {

	@Override
	public void paint() {
		System.out.println("paint linux style checkbox");
	}

}
