package org.buzheng.study.pattern.factorymethod;

public class PdfDocument implements Document {

	public PdfDocument() {
		System.out.println("Creating pdf document.");
	}

	@Override
	public void save() {
		System.out.println("save pdf document.");
	}

	@Override
	public void close() {	
		System.out.println("close pdf document");
	}

	@Override
	public void edit() {
		System.out.println("edit pdf document");
	}

}
