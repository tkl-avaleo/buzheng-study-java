package org.buzheng.study.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class DefaultSubjectImpl implements Subject {
	
	private List<Observer> observers = null;
	public DefaultSubjectImpl() {
		this.observers = new ArrayList<Observer>();
	}

	public void attachObserver(Observer observer) {
		this.observers.add(observer);
		System.out.println("add an observer: " + observer);
	}

	public void detachObserver(Observer observer) {
		this.observers.remove(observer);
		System.out.println("remove an observer: " + observer);
	}

	public void notifyObservers() {
		System.out.println("notify all registed observers");
		for (Observer observer : this.observers) {
			observer.update();
		}
	}

}
