package com.iluwatar.factory.method.v3.iphone;

// 生产手机这一簇产品的工厂: 可以生产不同品牌
public interface PhoneProductFactroy {
    Phone createPhone(); // 生产手机

    EarPhone createEarPhone(); // 生产耳机

    PhoneBox createPhoneBox(); // 生产包装盒

//    XProduct createX(); // 生产xxx
}
