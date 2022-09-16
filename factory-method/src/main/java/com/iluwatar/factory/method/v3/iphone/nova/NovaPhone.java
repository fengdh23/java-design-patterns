package com.iluwatar.factory.method.v3.iphone.nova;

import com.iluwatar.factory.method.v3.iphone.Phone;

public class NovaPhone implements Phone {
    @Override
    public void create2() {
        System.out.println("荣耀手机");
    }
}
