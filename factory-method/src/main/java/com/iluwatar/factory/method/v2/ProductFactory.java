package com.iluwatar.factory.method.v2;

import com.iluwatar.factory.method.v1.Product;

//接口：抽象工厂
public interface ProductFactory {
    // 只有一个产品
    public Product create();
    //根据id获取实例，这里实际获取的是getObject返回的对象

}
