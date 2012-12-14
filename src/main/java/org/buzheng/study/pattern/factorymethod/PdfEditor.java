package org.buzheng.study.pattern.factorymethod;

public class PdfEditor extends DocumentEditor {

	public PdfEditor() {
		System.out.println("creating pdf editor");
	}

	@Override
	public Document openDocument() {
		return new PdfDocument();
	}
}
