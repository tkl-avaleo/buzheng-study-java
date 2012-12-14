package org.buzheng.study.pattern.factorymethod;

public class TxtEditor extends DocumentEditor {

	public TxtEditor() {
		System.out.println("creating txt editor");
	}

	@Override
	public Document openDocument() {
		return new TxtDocument();
	}
}
