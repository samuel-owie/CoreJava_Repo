package com.packages.chapters.chapter05.abstractClasses;

public abstract class Person {
    public abstract String getDescription();
    private String name;

    //Constructor
    public Person(String name){
        this.name = name;
    }

    //Getters and setters
    public String getName(){
        return name;
    }
}
