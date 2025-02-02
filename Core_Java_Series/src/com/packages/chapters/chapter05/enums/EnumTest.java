package com.packages.chapters.chapter05.enums;

import java.util.*;
/**
 * This program demonstrates enumerated classes.
 * @version 1.0 11.01.2025
 * @author Samuel Owie
 */

public class EnumTest {
    public static void main(String[] args){
        var in = new Scanner(System.in);

        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");

        String input= in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size= " + size);
        System.out.println("abbreviation= " + size.getAbbreviation());

        if(size == Size.EXTRA_LARGE){
            System.out.println("Good job -- you paid attention to this");
        }
    }
}
