package com.imvsaurabh.java.concept;

import java.util.Objects;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /*
    * Equals and HashCode Contract:
    * Two objects that are equal according to the equals(Object) method must
    * return the same hash code value according to the hashCode() method.
    * same hash code does not imply equality but equal objects must have the same hash code.
    */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class EqualAndHashCodeContract {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Alice");
        Employee emp2 = new Employee(1, "Alice");

        System.out.println("emp1.equals(emp2): " + emp1.equals(emp2)); // true
        System.out.println("emp1.hashCode() == emp2.hashCode(): " + (emp1.hashCode() == emp2.hashCode())); // true
    }
}
