package com.iluwatar.templatemethod;

/**
 * 
 * HitAndRunMethod implementation of {@link StealingMethod}.
 *
 */
public class HitAndRunMethod extends StealingMethod {

	@Override
	protected String pickTarget() {
		return "old 丑妖怪 woman";
	}

	@Override
	protected void confuseTarget(String target) {
		System.out.println("从背后接近 the " + target + " from behind.");
	}

	@Override
	protected void stealTheItem(String target) {
		System.out.println("抓住手提包 and run away fast!");
	}

}
