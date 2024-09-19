package com.imvsaurabh.java.designpattern.builder;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = Computer.builder()
                .cpu("i7").build();
    }
}
