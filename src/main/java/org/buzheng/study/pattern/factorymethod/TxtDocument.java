package org.buzheng.study.pattern.factorymethod;

public class TxtDocument implements Document {

	public TxtDocument() {
		System.out.println("Creating txt document.");
	}

	@Override
	public void save() {
		System.out.println("save txt document.");
	}

	@Override
	public void close() {	
		System.out.println("close txt document");
	}

	@Override
	public void edit() {
		System.out.println("edit txt document");
	}

}
