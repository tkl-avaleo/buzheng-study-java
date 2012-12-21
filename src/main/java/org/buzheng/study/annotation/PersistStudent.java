package org.buzheng.study.annotation;

import java.lang.reflect.Method;

public class PersistStudent {

	public static void main(String[] args) throws Exception {
		Object c = Class.forName("org.buzheng.study.annotation.Student").newInstance();
		
		Method[] methods = c.getClass().getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			if (methods[i].isAnnotationPresent(ValueBind.class)) {
				ValueBind annotation = methods[i].getAnnotation(ValueBind.class);
				String type = String.valueOf(annotation.type());
				String value = String.valueOf(annotation.value());
				if ("INT".equals(type)) {
					methods[i].invoke(c, new Integer[]{new Integer(value)});
				} else {
					methods[i].invoke(c, new String[]{value});
				}
			}
		}
		
		Student s = (Student) c;
		System.out.println("name: " + s.getName() + ", age: " + s.getAge());
	}

}
