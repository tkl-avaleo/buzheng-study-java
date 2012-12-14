package org.buzheng.study.pattern.abstractfactory;

public class LinuxThemeFactory implements ThemeFactory {

	@Override
	public Button getButton() {
		return new LinuxButton();
	}

	@Override
	public CheckBox getCheckBox() {
		return new LinuxCheckBox();
	}

}
