package com.iluwatar.adapter.v2;

public class Iphone {
    // 充电接口 默认 的实例是 AppleCharger
    private LightningInterface lightningInterface;

    public Iphone(LightningInterface lightningInterface) {
        this.lightningInterface = lightningInterface;
    }

    public Iphone() {
    }

    public void charge() {
        System.out.println("开始给 Iphone 充电...");
        lightningInterface.chargeWithLightning(); // 可以切换为使用适配器
        System.out.println("结束给 Iphone 充电...");
    }

    public LightningInterface getLightningInterface() {
        return lightningInterface;
    }

    public void setLightningInterface(LightningInterface lightningInterface) {
        this.lightningInterface = lightningInterface;
    }
}
