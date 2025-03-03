package com.packages.chapters.chapter06.lambda;

import java.util.*;

import javax.swing.*;
import javax.swing.Timer;

/**
 * This program demonstrates enumerated classes.
 * @version 1.0 08.02.2025
 * @author Samuel Owie
 */

public class LambdaTest {
    public static void main(String[] args){
        var planets = new String[] { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order: ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));//

        var timer = new Timer(100, event -> System.out.println("The time is " + new Date()));
        timer.start();

        //keep program running until user selects "Ok"
        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}
