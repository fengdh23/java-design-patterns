package com.iluwatar.factory.method.v3.iphone.honor;

import com.iluwatar.factory.method.v3.iphone.EarPhone;
import com.iluwatar.factory.method.v3.iphone.Phone;
import com.iluwatar.factory.method.v3.iphone.PhoneBox;
import com.iluwatar.factory.method.v3.iphone.PhoneProductFactroy;

// 荣耀工厂
public class HonorPhoneProductFactroy implements PhoneProductFactroy {

    @Override
    public Phone createPhone() {
        return new HonorPhone();
    }

    @Override
    public EarPhone createEarPhone() {
        return new HonorEarPhone();
    }

    @Override
    public PhoneBox createPhoneBox() {
        return new HonorPhoneBox();
    }
}
