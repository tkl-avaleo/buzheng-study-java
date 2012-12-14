package org.buzheng.study.pattern.abstractfactory;

public class WindowThemeFactory implements ThemeFactory {

	@Override
	public Button getButton() {
		return new WindowButton();
	}

	@Override
	public CheckBox getCheckBox() {
		return new WindowCheckBox();
	}

}
