package com.imvsaurabh.java.designpattern.prototype;

import java.util.concurrent.ConcurrentHashMap;

import static com.imvsaurabh.java.designpattern.prototype.ProfessionEnum.*;

public class ProfessionPrototype {
    private static final ConcurrentHashMap<ProfessionEnum, Profession> PROFESSION_MAP = new ConcurrentHashMap<>();

    public static void loadProfessions() {
        Teacher teacher = new Teacher();
        teacher.professionName = "Teacher";

        Driver driver = new Driver();
        driver.professionName = "Driver";

        Engineer engineer = new Engineer();
        engineer.professionName = "Engineer";

        PROFESSION_MAP.put(TEACHER, teacher);
        PROFESSION_MAP.put(DRIVER, driver);
        PROFESSION_MAP.put(ENGINEER, engineer);
    }

    public static Profession getProfessionObject(ProfessionEnum professionEnum) {
        return PROFESSION_MAP.get(professionEnum).clone();
    }
}
