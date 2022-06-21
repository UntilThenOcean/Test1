package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class test2 {

}

class DogTestDrive {
    public static void main (String[] args) {

        Dog d = new Dog("nine");
        d.makeNoise();
        d.roam();
        d.eat();
        d.sleep();


        double r1 = Math.random();
        int r2 = (int) (Math.random() *5);
        System.out.println(r1);

        int x = Math.abs(-240);
        double c = Math.abs(240.45);
        System.out.println(c);

        int e = Math.round(-24.8f);
        int f = Math.round(24.45f);
        System.out.println("round:" + e);
        System.out.println("round:" + f);

        int g = 32;
        ArrayList list = new ArrayList();
        list.add(g);
        System.out.println(g);

        ArrayList<Integer> listOfNumber = new ArrayList<Integer>();
        listOfNumber.add(3);
        int num = listOfNumber.get(0);
        System.out.println(num);


    }
}




