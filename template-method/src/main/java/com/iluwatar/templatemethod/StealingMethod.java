package com.iluwatar.templatemethod;

/**
 *  也可以实现 接口, 注意参数的设计--> 泛型。
 * StealingMethod defines skeleton for the algorithm.
 * 
 */
public abstract class StealingMethod {

	protected abstract String pickTarget();

	protected abstract void confuseTarget(String target);

	protected abstract void stealTheItem(String target);

	public void steal() {
		String target = pickTarget();
		doSomeThing();
		confuseTarget(target);
		stealTheItem(target);
	}

	private void doSomeThing() {
		System.out.println("休息一会");
	}
}
