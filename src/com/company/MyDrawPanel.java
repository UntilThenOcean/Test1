package com.company;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel implements ControllerEventListener {

    boolean mag = false;

    public static void main (String[] args) {


    }

    public void paintComponent(Graphics g) {

        /*g.setColor(Color.orange);
        g.fillRect(20,50,100,100);*/

        /*Image image = new ImageIcon("").getImage();
        g.drawImage(image,3,4,this);*/

        /*
        g.fillRect(0,0,this.getWidth(),this.getHeight());

        int red = (int) (Math.random() * 255);
        int green  = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70,70,100,100);*/

        /*Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(70,70,Color.blue,150,160,Color.orange);

        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);*/


        /*
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70,70,startColor,150,150,endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);*/

/*
        int x,y;
        x = 10;
        y=50;
        g.setColor(Color.orange);
        g.fillOval(x,y,100,100);*/


        if (mag) {

            Graphics2D g2 = (Graphics2D) g;

            int r = (int) (Math.random() * 250);
            int gr = (int) (Math.random() * 250);
            int b = (int) (Math.random() * 250);

            g.setColor(new Color(r,gr,b));

            int ht = (int) ((Math.random() * 120 ) + 10);
            int widtho = (int) ((Math.random() * 120) + 10);
            int x = (int) ((Math.random() * 40) + 10);
            int y = (int) ((Math.random() * 40) + 10);

            g.fillRect(x, y, widtho, ht);
            mag = false;


        }

    }

    @Override
    public void controlChange(ShortMessage event) {

        mag = true;
        repaint();

    }
}
