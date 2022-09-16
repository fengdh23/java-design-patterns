package com.iluwatar.factory.method.v3.iphone.nova;

import com.iluwatar.factory.method.v3.iphone.PhoneBox;

public class NovaPhoneBox implements PhoneBox {
    @Override
    public void create3() {
        System.out.println("荣耀包装盒");
    }
}
