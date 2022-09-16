package com.iluwatar.adapter.v3;

import com.iluwatar.adapter.v2.LightningInterface;

/**
 * 该适配器的功能是把一个MicroUsb转换成Lightning。实现方式是实现目标类的接口（LightningInterface），
 * 然后使用组合的方式，在该适配器中定义microUsb。
 * 然后在重写的chargeWithLightning（）方法中，采用microUsb的方法来实现具体细节
 * 1. 实现适配的目标的接口
 */
public class MicroUSB2LightningAdapter implements LightningInterface {
    // 引用
    private MicroUsbInterface microUsbInterface;

    public MicroUSB2LightningAdapter(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    @Override
    public void chargeWithLightning() {
        microUsbInterface.chargeWithMicroUsb();
    }

    public MicroUsbInterface getMicroUsbInterface() {
        return microUsbInterface;
    }

    public void setMicroUsbInterface(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

}
