package org.buzheng.study.pattern.visitor;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		Visitor visitor = new ConcreteVisitor();

		StringElement se = new StringElement("I am a String");
		visitor.visitString(se);

		Collection<Visitable> list = new ArrayList<Visitable>();
		list.add(new StringElement("I am a String1")); 
		list.add(new StringElement("I am a String2")); 
		list.add(new FloatElement(new Float(12))); 
		list.add(new StringElement("I am a String3")); 
		
//		visitor.visitCollection(list);
		
		for (Visitable v : list) {
			v.accept(visitor);
		}
	}
}
