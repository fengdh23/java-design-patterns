package com.iluwatar.factory.method.v2;

import com.iluwatar.factory.method.v1.Product;

public class Client {
    public static void main(String args[]) {
        ProductFactory factory;
        Product logger;
        //
        factory = new PhoneFactory(); //可引入配置文件实现
        logger = factory.create();


    }
}
