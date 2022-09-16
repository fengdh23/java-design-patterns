package com.iluwatar.proxy.jdk;

public class Audi implements ICar {
    @Override
    public void drive(String driverName, String carName) {
        System.err.println("Audi is driving... " + "driverName: " + driverName + ", carName" + carName);
    }
}
