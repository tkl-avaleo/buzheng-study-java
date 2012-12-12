package org.buzheng.study.pattern.state;

public class MediumState implements State {

	public void switchClockwise(FireSwitch fs) {
		fs.setState(new LargeState());
		System.out.println("medium -> large");
	}

	public void switchCounterClockwise(FireSwitch fs) {
		fs.setState(new SmallState());
		System.out.println("medium -> small");
	}

}
