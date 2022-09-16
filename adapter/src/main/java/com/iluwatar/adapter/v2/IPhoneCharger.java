package com.iluwatar.adapter.v2;


public class IPhoneCharger implements LightningInterface{
    @Override
    public void chargeWithLightning() {
        System.out.println("使用 Lightning 型号的充电器充电...");
    }
}
