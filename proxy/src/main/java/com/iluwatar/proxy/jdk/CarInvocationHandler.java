package com.iluwatar.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CarInvocationHandler implements InvocationHandler {

    private ICar car;

    public CarInvocationHandler(ICar car) {
        this.car = car;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("before");
        // 实际的对象
        method.invoke(car, args);

        System.err.println("after");
        return null;
    }
}
