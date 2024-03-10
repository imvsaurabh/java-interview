package com.imvsaurabh.java.designpattern.factory;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        Product smartPhone = ProductFactory.createSmartPhone();
        smartPhone.getProductInfo();

        Product condom = ProductFactory.createCondom();
        condom.getProductInfo();
    }
}
