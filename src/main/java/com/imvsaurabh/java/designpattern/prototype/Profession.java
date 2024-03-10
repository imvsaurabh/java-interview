package com.imvsaurabh.java.designpattern.prototype;

public abstract class Profession implements Cloneable {
    public String professionName;

    public void getProfessionInfo() {
        System.out.println("I am " + professionName);
    }

    public abstract void workInfo();

    @Override
    public Profession clone() {
        try {
            return (Profession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
