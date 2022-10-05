package com.iluwatar.chain.v3;

/**
 * 该例子 重复代码还是很多。
 */
public abstract class AbstractHandler {
    /**
     * 下一关用当前抽象类来接收
     */
    protected AbstractHandler next;

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    public abstract int handler();
}

