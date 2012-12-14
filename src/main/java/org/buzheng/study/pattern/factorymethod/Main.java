package org.buzheng.study.pattern.factorymethod;

public class Main {

	public static void main(String[] args) {
		DocumentEditor editor = new PdfEditor();
		editor.editDocument();
		editor.saveDocument();
		editor.closeDocument();
		
		editor = new TxtEditor();
		editor.editDocument();
		editor.saveDocument();
		editor.closeDocument();
	}

}
