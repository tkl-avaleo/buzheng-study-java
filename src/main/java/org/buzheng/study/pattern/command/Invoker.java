package org.buzheng.study.pattern.command;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
	private Map<String, ICommand> commands;
	
	public Invoker() {
		this.commands = new HashMap<String, ICommand>();
	}
	
	
	public void addCommand(String commandName, ICommand command) {
		this.commands.put(commandName, command);
	}
	
	public void request(String commandName) {
		ICommand command = this.commands.get(commandName);
		if (command != null) {
			command.execute();
		}
	}
}
