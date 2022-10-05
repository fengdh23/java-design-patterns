package com.iluwatar.proxy.dynamicproxy;

import com.iluwatar.proxy.staticproxy.IBuyHouse;
import com.iluwatar.proxy.staticproxy.MyBuyHouseImpl;

import java.lang.reflect.Proxy;

/**
 * @author 15073747
 * @datetime 2018-08-28 16:02
 * @desc
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        IBuyHouse buyHouse = new MyBuyHouseImpl();
        IBuyHouse proxy = (IBuyHouse) Proxy.newProxyInstance(buyHouse.getClass().getClassLoader(),
                new Class[]{IBuyHouse.class}
                , new JDKProxyHandler(buyHouse));
        IBuyHouse proxy2 = (IBuyHouse) Proxy.newProxyInstance(buyHouse.getClass().getClassLoader(),
                new Class[]{IBuyHouse.class}
                , new JDKProxyHandler2(buyHouse));
        proxy.buyHouse(22);
        System.out.println("~~~~~~~~~~我是风骚的分割线~~~~~~~~~~");
        proxy2.buyHouse(33);
        System.out.println("===================我是风骚的分割线==================");
        //Exception in thread "main" java.lang.StackOverflowError
        IBuyHouse buyHouse2 = new MyBuyHouseImpl();
        CglibProxy cglibProxy = new CglibProxy();
        MyBuyHouseImpl proxyImpl = (MyBuyHouseImpl) cglibProxy.getInstance(buyHouse2);
        proxyImpl.buyHouse(111);
    }
}
