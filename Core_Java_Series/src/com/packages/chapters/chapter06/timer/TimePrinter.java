package com.packages.chapters.chapter06.timer;

import java.awt.*;
import java.awt.event.*;
import java.time.*;

class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event){
        System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
