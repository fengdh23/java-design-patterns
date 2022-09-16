package com.iluwatar.adapter.v1;

public class Adapter extends Target{
    private Adaptee adaptee; //维持一个对适配者对象的引用

    public Adapter(Adaptee adaptee) {
        this.adaptee=adaptee;
    }

    public void request() {
        adaptee.specificRequest(); //转发调用
    }
}
