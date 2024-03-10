package com.imvsaurabh.java.designpattern.prototype;

import static com.imvsaurabh.java.designpattern.prototype.ProfessionEnum.*;

public class PrototypeDesignPattern {
    public static void main(String[] args) {
        ProfessionPrototype.loadProfessions();
        Profession teacher = ProfessionPrototype.getProfessionObject(TEACHER);
        Profession driver = ProfessionPrototype.getProfessionObject(DRIVER);
        Profession engineer1 = ProfessionPrototype.getProfessionObject(ENGINEER);
        Profession engineer2 = ProfessionPrototype.getProfessionObject(ENGINEER);

        System.out.println(teacher);
        System.out.println(driver);
        System.out.println(engineer1);
        System.out.println(engineer2);
    }
}
