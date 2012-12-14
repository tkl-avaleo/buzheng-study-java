package org.buzheng.study.pattern.abstractfactory;

public class Main {
	
	public static void main(String[] args) {
		Button button = null;
		CheckBox checkbox = null;
		
		ThemeFactory macFactory = new MacThemeFactory();
		
		button = macFactory.getButton();
		button.paint();
		
		checkbox = macFactory.getCheckBox();
		checkbox.paint();
		
		//---------------------------------
		macFactory = new LinuxThemeFactory();
		
		button = macFactory.getButton();
		button.paint();
		
		checkbox = macFactory.getCheckBox();
		checkbox.paint();
		
		//---------------------------------
		macFactory = new WindowThemeFactory();
		
		button = macFactory.getButton();
		button.paint();
		
		checkbox = macFactory.getCheckBox();
		checkbox.paint();
	}
	
}
