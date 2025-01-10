package com.packages.chapters.chapter05.arrayList;

import java.time.*;
import java.util.*;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;


    //Constructor
    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    //Getters and Setters
    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Object otherObject){
        //A quick test if the objects are equal
        if(this == otherObject) return true;

        //Must return false if the explicit parameter is null
        if(otherObject == null) return false;

        //If the classes don't match, they can't be equal
        if(getClass() != otherObject.getClass()) return false;

        //Now we know otherObjects is a non-null Employee
        var other = (Employee) otherObject;

        //Test whether the fields have identical values;
        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay,other.hireDay);
    }

    public int hashCode(){
        return Objects.hash(name, salary, hireDay);
    }

    public String toString(){
        return getClass().getName() + "[name= " + name + ", salary= " + salary + ", hireDay= " + hireDay + "]";
    }
}
