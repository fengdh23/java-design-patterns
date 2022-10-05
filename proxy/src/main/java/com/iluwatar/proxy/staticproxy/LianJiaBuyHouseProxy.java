package com.iluwatar.proxy.staticproxy;

/**
 * 静态代理
 * 如果有新的需求 比如卖房、 抵押手续、解押手续 就需要实现多个接口
 * --> 动态代理 技术手段就是 反射来实现动态
 * @author 15073747
 * @datetime 2018-08-28 15:52
 * @desc
 */
public class LianJiaBuyHouseProxy implements IBuyHouse {
    private IBuyHouse buyHouse;

    public IBuyHouse getBuyHouse() {
        return buyHouse;
    }

    public void setBuyHouse(IBuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse(int size) {
        //实现功能的增强（前置）
        System.out.println("买房前准备-链家小哥联系房东");
        buyHouse.buyHouse(size);
        //实现功能的增强（后置）
        System.out.println("买房后装修-链家小哥联系我");
    }
}
