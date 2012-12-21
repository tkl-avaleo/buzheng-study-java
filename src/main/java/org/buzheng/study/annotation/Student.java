package org.buzheng.study.annotation;

import java.io.Serializable;

import org.buzheng.study.annotation.ValueBind.fieldType;

public class Student implements Serializable {

	private String name;

	public String getName() {
		return name;
	}

	@ValueBind(type=fieldType.STRING, value="aa")
	public void setName(String name) {
		this.name = name;
	}
	
	private int age;

	public int getAge() {
		return age;
	}

	@ValueBind(type=fieldType.INT, value="20")
	public void setAge(int age) {
		this.age = age;
	}

}
