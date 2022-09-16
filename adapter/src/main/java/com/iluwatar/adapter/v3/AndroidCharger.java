package com.iluwatar.adapter.v3;

public class AndroidCharger implements MicroUsbInterface {
    @Override
    public void chargeWithMicroUsb() {
        System.out.println("使用 MicroUsb 型号的充电器充电...");
    }
}
