package com.packages.chapters.chapter05.pattermatching;

public final class Executive extends Manager {
    private double specialAwards;
    private String title;

    public Executive(String name, String title, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        specialAwards = 0;
        this.title = title;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + specialAwards;
    }

    public void setSAwards(double s){
        specialAwards = s;
    }

    public double getSAwards(){
        return specialAwards;
    }

    public String getTitle(){
        return title;
    }
}
