package com.packages.chapters.chapter05.abstractClasses;

public class Student extends Person{
    private String major;
    /**
     * @param name is the student's name
     * @param major is the student's major
     */

    public Student(String name, String major){
        super(name);
        this.major = major;
    }

    public String getDescription(){
        return "a student majoring in " + major;
    }
}
