package com.packages.chapters.chapter05.abstractClasses;

/**
 * This program demonstrates abstract classes.
 * @version 1.0 10.01.2025
 * @author Samuel Owie
 */

public class PersonTest {
    public static void main(String[] args){
        var people = new Person[2];

        //Fill the people array with Student and Employee objects
        people[0] = new Employee("Harry", 50000, 1989, 10, 1);
        people[1] = new Student("Maria", "computer science");

        //Print out names and descriptions of all Person objects for (Person p : people)
        for(Person p : people){
            System.out.println(p.getName() + ", " + p.getDescription());
        }

    }
}
