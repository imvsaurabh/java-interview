package com.imvsaurabh.java.designpattern.factory;

public class SmartPhone implements Product {
    @Override
    public void getProductInfo() {
        System.out.println("This is smartphone product");
    }
}
