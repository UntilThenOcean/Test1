package com.company;

import javax.swing.*;
import java.awt.*;

public class swingfirst {

    public static void main (String[] args) {
        swingfirst gui = new swingfirst();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JButton east = new JButton("East");
        JButton west = new JButton("West");
        JButton north = new JButton("North");
        JButton south = new JButton("South");
        JButton center = new JButton("Center");

        //Font bigFont = new Font("serif", Font.BOLD, 50);
        //frame.setFont(bigFont);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setSize(300,300);
        frame.setVisible(true);
    }


}
