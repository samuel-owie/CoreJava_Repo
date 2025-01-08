package com.packages.chapters.chapter05.inheritance;

public class Executive extends Manager{
    private int SAwards;

    public Executive(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
    }
}
