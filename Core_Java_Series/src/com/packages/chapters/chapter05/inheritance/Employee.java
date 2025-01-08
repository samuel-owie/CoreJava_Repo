package com.packages.chapters.chapter05.inheritance;

import java.time.*;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    // Constructor
    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    // Getters and setters
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
        double raise= salary * byPercent / 100;
        salary += raise;
    }
}
