package HW3.Knifes.US;

import HW3.Knifes.Knife;

public abstract class USKnife extends Knife {
	@Override
	public void localFinish() {
		System.out.println("US finish");
	}
}
