package com.tamusa.pomodoroGuide;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    //Sample code to test out JFrame
    // Attribute
    private JButton buttonEast; // The east button
    private JButton buttonSouth; // The south button
    private JButton buttonWest; // The west button
    private JButton buttonNorth; // The north button
    private JButton buttonCenter; // The center button
    public Menu() {
        // Call super class constructor with a title
        super("Frame With Multiple Buttons");
        // Create JButton objects
        buttonEast = new JButton("East");
        buttonSouth = new JButton("South");
        buttonWest = new JButton("West");
        buttonNorth = new JButton("North");
        buttonCenter = new JButton("Center");
        // Add the JButton objects
        add(buttonEast, BorderLayout.EAST);
        add(buttonSouth, BorderLayout.SOUTH);
        add(buttonWest, BorderLayout.WEST);
        add(buttonNorth, BorderLayout.NORTH);
        add(buttonCenter, BorderLayout.CENTER);
        // Set when the close button is clicked, the application exits
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Reorganize the embedded components
        pack();
    }

    public static void main() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu frame = new Menu();
                frame.setVisible(true);
            }
        });
    }
    }










