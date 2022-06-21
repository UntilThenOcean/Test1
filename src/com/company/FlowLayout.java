package com.company;

import javax.swing.*;
import java.awt.*;

public class FlowLayout {

    public static void main (String[] args) {

        FlowLayout gui = new FlowLayout();
        gui.go();
    }

    private void go() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        // set panel background
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // set button
        JButton button = new JButton("shock me");
        JButton button2 = new JButton("bliss");

        panel.add(button);
        panel.add(button2);
        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(200,200);
        frame.setVisible(true);



    }
}
