package com.iluwatar.proxy.dynamicproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 15073747
 * @datetime 2018-08-28 16:16
 * @desc
 */
public class CglibProxy implements MethodInterceptor {
    //关联目标对象
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    //截击; 拦截
    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("买房前准备");
        //仅仅执行客户单调用的方法
//        Object result = methodProxy.invoke(object, args);// 堆栈溢出
        Object result = methodProxy.invoke(target, args);
        System.out.println("买房后装修");
        return result;
    }
}
