package org.buzheng.study.pattern.memento;

public class Originator {
	private String name;

	private String phone;

	public Originator(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public void someOperation() {
		name = "nobody";
		phone = "911-911";
	}

	public void setMemento(Memento m) {
		this.name = m.getName();
		this.phone = m.getPhone();
	}

	public Memento createMemento() {
		return new Memento(name, phone);
	}

	public void showInfo() {
		System.out.println("Name: " + name + "\nPhone: " + phone + "\n");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
