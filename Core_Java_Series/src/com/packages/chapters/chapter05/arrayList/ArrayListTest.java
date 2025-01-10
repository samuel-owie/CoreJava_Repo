package com.packages.chapters.chapter05.arrayList;

import java.util.*;
/**
 * This program demonstrates the ArrayList class.
 * @version 1.0 10.01.2025
 * @author Samuel Owie
 */

public class ArrayListTest {
    public static void main(String[] args){
        //Fill the staff arayy with three Employee objects
        var staff = new ArrayList<Employee>();

        staff.add(new Employee("Carl", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry", 50000, 1989, 10, 1));
        staff.add(new Employee("Tony", 40000, 1990, 3, 15));

        //Raise everyone's salary by 5%
        for(Employee e : staff){
            e.raiseSalary(5);
        }

        //Print out information about all Employee objects for (Employee e : staff)
        for(Employee e : staff){
            System.out.println("name= " + e.getName() + ", salary= " + e.getSalary() + ", hireDay= " + e.getHireDay());
        }
    }
}
