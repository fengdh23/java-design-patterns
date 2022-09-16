package com.iluwatar.strategy;

/**
 * DragonSlayer uses different strategies to slay the dragon.
 */
public class DragonSlayer {

    private DragonSlayingStrategy strategy;

    public DragonSlayer(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    // TODO 提供替换策略的方法
    public void changeStrategy(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void goToBattle() {
        strategy.execute();
    }
}
