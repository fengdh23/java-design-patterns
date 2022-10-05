package com.iluwatar.proxy.staticproxy;

/**
 * @author 15073747
 * @datetime 2018-08-28 15:51
 * @desc
 */
public class MyBuyHouseImpl implements IBuyHouse {
    @Override
    public void buyHouse(int i) {
        System.out.println("我要买房");
    }
}
