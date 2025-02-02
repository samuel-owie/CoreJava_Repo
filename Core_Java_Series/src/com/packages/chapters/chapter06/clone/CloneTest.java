package com.packages.chapters.chapter06.clone;

/**
 * This program demonstrates enumerated classes.
 * @version 1.0 02.02.2025
 * @author Samuel Owie
 */

public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException{
        var original = new Employee("John Q. Public", 5000);
        original.setHireDay(2000, 1,1);
        Employee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2002, 12, 31);
        System.out.println("original=" + original);
        System.out.printf("copy=" + copy);
    }
}
