package org.buzheng.study.pattern.visitor;

import java.util.Collection;

public interface Visitor {

	public void visitString(StringElement se);
	public void visitFloat(FloatElement fe);
	public void visitCollection(Collection<Visitable> collection);
	
}
