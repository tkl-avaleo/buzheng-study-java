package org.buzheng.study.pattern.visitor;

import java.util.Collection;

public class ConcreteVisitor implements Visitor {

	@Override
	public void visitString(StringElement se) {
		System.out.println("StringElement:" + se.getValue());
	}

	@Override
	public void visitFloat(FloatElement fe) {
		System.out.println("FloatElement:" + fe.getValue());

	}

	@Override
	public void visitCollection(Collection<Visitable> collection) {
		for (Visitable v : collection) {
			v.accept(this);
		}
	}

}
