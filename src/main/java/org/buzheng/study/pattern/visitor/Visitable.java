package org.buzheng.study.pattern.visitor;

public interface Visitable {
	public void accept(Visitor visitor);
}
