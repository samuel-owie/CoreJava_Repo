package com.packages.chapters.chapter05.abstractClasses;

import java.time.*;

public class Employee extends Person{
    private double salary;
    private LocalDate hireDay;

    //Constructor
    public Employee(String name, double salary, int year, int month, int day){
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    //Getters and setters
    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public String getDescription(){
        return "an employee with a salary of $%.2f".formatted(salary);
    }

    public void raiseSalary(double byPercent){
        double raise = salary + byPercent / 100;
        salary += raise;
    }
}
