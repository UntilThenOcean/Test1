package com.company;

import javax.swing.*;

public class Gui {

    public static void main (String[] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("click me");

        // end the program when close the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // add button into pane of frame
        frame.getContentPane().add(button);
        // set size of frame
        frame.setSize(300,300);
        // show the frame
        frame.setVisible(true);



    }



}
