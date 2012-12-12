package org.buzheng.study.pattern.state;

public class LargeState implements State {

	public void switchClockwise(FireSwitch fs) {
		fs.setState(new OffState());
		System.out.println("large -> off");
	}

	public void switchCounterClockwise(FireSwitch fs) {
		fs.setState(new MediumState());
		System.out.println("large -> medium");
	}

}
