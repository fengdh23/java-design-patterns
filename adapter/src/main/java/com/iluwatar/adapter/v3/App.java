package com.iluwatar.adapter.v3;

import com.iluwatar.adapter.v2.IPhoneCharger;
import com.iluwatar.adapter.v2.Iphone;

public class App {
    public static void main(String[] args) {
        Iphone iphone = new Iphone(new IPhoneCharger());
        iphone.charge();

        MicroUSB2LightningAdapter adapter = new MicroUSB2LightningAdapter(new AndroidCharger());

        Iphone iphoneWithAdapter = new Iphone();
        iphoneWithAdapter.setLightningInterface(adapter); // 使用适配器
        iphoneWithAdapter.charge();
    }
}
