package com.packages.chapters.chapter06.interfaces;

import java.util.*;
/**
 * This program demonstrates enumerated classes.
 * @version 1.0 11.01.2025
 * @author Samuel Owie
 */

public class EmployeeSortTest {
    public static void main(String[] args){
        var staff = new Employee[3];

        staff[0]= new Employee("Harry", 35000);
        staff[1]= new Employee("Carl", 75000);
        staff[2]= new Employee("Tony", 38000);

        Arrays.sort(staff);

        //Print out information about all Employee objects
        for (Employee e : staff){
            System.out.printf(" name= " + e.getName() + ", salary= " + e.getSalary());
        }
    }
}
