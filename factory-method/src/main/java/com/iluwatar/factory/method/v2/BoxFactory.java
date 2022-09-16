package com.iluwatar.factory.method.v2;

import com.iluwatar.factory.method.v1.Box;
import com.iluwatar.factory.method.v1.Product;

public class BoxFactory implements ProductFactory {
    @Override
    public Product create() {
        return new Box();
    }
}
