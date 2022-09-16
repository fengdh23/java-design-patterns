package com.iluwatar.factory.method.v3.iphone.nova;

import com.iluwatar.factory.method.v3.iphone.EarPhone;

public class NovaEarPhone implements EarPhone {
    @Override
    public void create() {
        System.out.println("荣耀耳机");
    }
}
