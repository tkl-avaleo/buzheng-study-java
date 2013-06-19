package org.buzheng.study.pattern.proxy;

public class ByeSpeaker implements IBye {

	public void sayBye(String name) {
		System.out.println(name + " bye bye.");
	}

}
