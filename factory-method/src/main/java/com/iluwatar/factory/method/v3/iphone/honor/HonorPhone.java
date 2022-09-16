package com.iluwatar.factory.method.v3.iphone.honor;

import com.iluwatar.factory.method.v3.iphone.Phone;

public class HonorPhone implements Phone {
    @Override
    public void create2() {
        System.out.println("荣耀手机");
    }
}
