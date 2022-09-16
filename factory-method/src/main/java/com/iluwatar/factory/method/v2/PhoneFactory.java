package com.iluwatar.factory.method.v2;

import com.iluwatar.factory.method.v1.Phone;
import com.iluwatar.factory.method.v1.Product;

public class PhoneFactory implements ProductFactory {
    @Override
    public Product create() {
        return new Phone();
    }
}
