package com.packages.chapters.chapter06.timer;

/**
 * This program demonstrates interfaces and callbacks.
 * @version 1.0 02.02.2025
 * @author Samuel Owie
 */

import javax.swing.*;

public class TimerTest {
    public static void main(String[] args)
    {
        var listener = new TimePrinter();

        //construct a timer that calls the listener once every second
        var timer = new Timer(1000, listener);
        timer.start();

        //Keep program running until the user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
