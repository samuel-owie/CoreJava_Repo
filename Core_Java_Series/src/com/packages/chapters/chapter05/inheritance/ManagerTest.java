package com.packages.chapters.chapter05.inheritance;

/**
 * This program demonstrates inheritance
 * @version 1.0 09.01.2025 (dd-mm-yyyy)
 * @author Samuel Owie
*/

public class ManagerTest {
    public static void main(String[] args){
        // Construct a Manager object
        var boss = new Manager("Carl", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        var exectuiveBoss = new Executive("Makin", 120000, 1977, 1, 25);
        exectuiveBoss.setSAwards(120000);

        var staff = new Employee[4];

        // Fill the staff array with Manager and Employee objects

        staff[0] = boss;
        staff[1] = new Employee("Harry", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy", 40000, 1990, 3, 15);

        // Print out information about all Employee Objects
        for(Employee e : staff){
            System.out.println("name= " + e.getName() + ", salary= " + e.getSalary());
        }
    }
}
