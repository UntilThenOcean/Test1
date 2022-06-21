package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C {

    JFrame frame;
    JLabel label;


    public static void main (String[] args) {

        SimpleGui3C gui = new SimpleGui3C();
        gui.go();

    }

    private void go() {

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add button into listener
        JButton colorbutton = new JButton("Change colors~");
        colorbutton.addActionListener(new ColorListener());

        JButton labelbutton = new JButton("change label~");
        labelbutton.addActionListener(new LabelListener());

        label = new JLabel("I am a label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorbutton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelbutton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(300,300);
        frame.setVisible(true);


    }


    class LabelListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            label.setText("Ouch!");
        }

    }

    class ColorListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            frame.repaint();
        }
    }

}

