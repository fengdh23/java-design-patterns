package com.iluwatar.factory.method.v3.iphone.nova;

import com.iluwatar.factory.method.v3.iphone.EarPhone;
import com.iluwatar.factory.method.v3.iphone.Phone;
import com.iluwatar.factory.method.v3.iphone.PhoneBox;
import com.iluwatar.factory.method.v3.iphone.PhoneProductFactroy;
import com.iluwatar.factory.method.v3.iphone.honor.HonorEarPhone;
import com.iluwatar.factory.method.v3.iphone.honor.HonorPhone;
import com.iluwatar.factory.method.v3.iphone.honor.HonorPhoneBox;

// 荣耀工厂
public class NovaPhoneProductFactroy implements PhoneProductFactroy {

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
