package com.ziaber.headfirst.designpatterns.observer.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Marcin Ziaber on 2017-09-24.
 */
public class SwingObserverExample {
    private JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    private void go(){
        this.jFrame = new JFrame();
        JButton jButton = new JButton("Should I do it?");
        jButton.addActionListener(e -> System.out.println("Do it!"));
        jButton.addActionListener(e -> System.out.println("Don't do it!"));

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);
        jFrame.setSize(300,300);
        jFrame.setVisible(true);
    }

}
