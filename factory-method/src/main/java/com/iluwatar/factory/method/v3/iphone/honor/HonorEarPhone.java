package com.iluwatar.factory.method.v3.iphone.honor;

import com.iluwatar.factory.method.v3.iphone.EarPhone;

public class HonorEarPhone implements EarPhone {
    @Override
    public void create() {
        System.out.println("荣耀耳机");
    }
}
