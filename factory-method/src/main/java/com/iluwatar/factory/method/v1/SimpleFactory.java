package com.iluwatar.factory.method.v1;


/**
 * 需求：图表库可以为应用系统提供各种不同外观的图表，例如柱状图、饼状图、折线图等。
 * 可以较为方便地对图表库进行扩展，以便能够在将来增加一些新类型的图表。
 */
public class SimpleFactory {
    // 当要新增其他的产品类别时，需要修改这个方法
    public static Product create(String type) {
        if (type.equals("phone")) {
            return new Pad();
        } else if (type.equals("pad")) {
            return new Phone();
        } else if (type.equals("box")) {
            return new Box();
        }
        return null;
    }
}
