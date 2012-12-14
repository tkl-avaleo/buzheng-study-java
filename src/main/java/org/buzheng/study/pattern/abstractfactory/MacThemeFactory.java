package org.buzheng.study.pattern.abstractfactory;

public class MacThemeFactory implements ThemeFactory {

	@Override
	public Button getButton() {
		return new MacButton();
	}

	@Override
	public CheckBox getCheckBox() {
		return new MacCheckBox();
	}

}
