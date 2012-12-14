package org.buzheng.study.pattern.factorymethod;

public abstract class DocumentEditor {
	
	private Document current = this.openDocument();
	
	public abstract Document openDocument();
	
	public void saveDocument() {
		this.current.save();
	}

	public void closeDocument() {
		this.current.close();
	}
	
	public void editDocument() {
		this.current.edit();
	}
}
