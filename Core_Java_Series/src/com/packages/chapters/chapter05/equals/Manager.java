package com.packages.chapters.chapter05.equals;

public class Manager extends Employee {

    private double bonus;

    //Constructor
    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
}
