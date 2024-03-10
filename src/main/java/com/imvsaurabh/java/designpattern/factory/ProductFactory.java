package com.imvsaurabh.java.designpattern.factory;

public class ProductFactory {

    public static Product createSmartPhone() {
        return new SmartPhone();
    }

    public static Product createCondom() {
        return new Condom();
    }
}
