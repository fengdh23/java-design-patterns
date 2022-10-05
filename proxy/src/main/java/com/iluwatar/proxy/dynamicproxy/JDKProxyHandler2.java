package com.iluwatar.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 15073747
 * @datetime 2018-08-28 16:00
 * @desc
 */
public class JDKProxyHandler2 implements InvocationHandler {
    //TODO 为什么是object  IBuyHouse 的实现类
    //关联目标对象
    private Object object;

    public JDKProxyHandler2(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房前准备");
//        buyHouse.buyHouse();
        Object result = method.invoke(object, args);
        System.out.println("买房后装修");
        return result;
    }
}
