package com.packages.chapters.chapter05.pattermatching;

public class TypePatternTest {
    public static void main(String[] args){
        int r =(int) (4 * Math.random());
        Employee e = switch (r){
            case 0 -> new Employee("Harry", 50000, 1989, 10, 1);
            case 1 -> new Manager("Carl", 80000, 1987, 12, 15);
            case 2 -> new Executive("Sue", "Senior Associate Vice President", 200000, 1995, 1, 20);
            default -> null;
        };
    }
}
