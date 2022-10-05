package com.iluwatar.proxy.staticproxy;

/**
 * @author 15073747
 * @datetime 2018-08-28 15:54
 * @desc
 */
public class App {
    public static void main(String[] args) {
        LianJiaBuyHouseProxy proxy = new LianJiaBuyHouseProxy();
        proxy.setBuyHouse(new MyBuyHouseImpl());
        proxy.buyHouse(100); 
        //如果目标该为 看装修 则都需要修改
//        proxy.buyHouse("豪华");
    }
}

