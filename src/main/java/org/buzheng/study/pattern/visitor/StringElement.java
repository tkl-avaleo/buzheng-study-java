package org.buzheng.study.pattern.visitor;

public class StringElement implements Visitable {
	
	private String value;

	public StringElement(String val) {
		this.value = val;
	}

	public String getValue() {
		return this.value;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visitString(this);
	}

}
