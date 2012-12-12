package org.buzheng.study.pattern.command;

public class UpperCaseHello implements ICommand {

	private String name;
	
	public UpperCaseHello(String name) {
		this.name = name;
	}
	
	public void execute() {
		System.out.println("hello " + name.toUpperCase());
	}
	
}
