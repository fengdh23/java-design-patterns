package com.iluwatar.proxy.jdk;

import java.lang.reflect.Proxy;

public class JdkMain {
    public static void main(String[] args) {
        ICar audi = (ICar) Proxy.newProxyInstance(ICar.class.getClassLoader(),
                new Class<?>[]{ICar.class},
                new CarInvocationHandler(new Audi()));
        audi.drive("name1", "audi");
//        before
//        Audi is driving... driverName: name1, carNameaudi
//        after
    }
}
