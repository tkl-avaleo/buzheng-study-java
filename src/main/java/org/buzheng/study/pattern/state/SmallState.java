package org.buzheng.study.pattern.state;

public class SmallState implements State {

	public void switchClockwise(FireSwitch fs) {
		fs.setState(new MediumState());
		System.out.println("small -> medium");
	}

	public void switchCounterClockwise(FireSwitch fs) {
		fs.setState(new OffState());
		System.out.println("small -> off");
	}

}
