package org.buzheng.study.pattern.observer;

public class Main {

	public static void main(String[] args) {
		Subject subject = new DefaultSubjectImpl();
		Observer o1 = new Observer1();
		Observer o2 = new Observer2();
		
		subject.attachObserver(o1);
		subject.attachObserver(o2);
		
		subject.notifyObservers();
	}
}
