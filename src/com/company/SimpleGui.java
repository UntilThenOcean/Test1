package com.company;

import javax.swing.*;
import java.awt.event.*;

// SimpleGui just an ActionListener
public class SimpleGui implements ActionListener {
    JButton button;

    public static void main (String[] args) {
        SimpleGui gui = new SimpleGui();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        MyDrawPanel gui = new MyDrawPanel();
        button = new JButton("click me");

        // register button
        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        button.setText("I've been clicked!");

    }
}
