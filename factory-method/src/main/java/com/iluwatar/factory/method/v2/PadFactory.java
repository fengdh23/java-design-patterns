package com.iluwatar.factory.method.v2;

import com.iluwatar.factory.method.v1.Pad;
import com.iluwatar.factory.method.v1.Product;

public class PadFactory implements ProductFactory {
    @Override
    public Product create() {
        return new Pad();
    }
}
