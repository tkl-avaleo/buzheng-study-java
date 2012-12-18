package org.buzheng.study.pattern.visitor;

public class FloatElement implements Visitable {
	
	private Float value;

	public FloatElement(Float val) {
		this.value = val;
	}

	public Float getValue() {
		return this.value;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visitFloat(this);
	}

}
