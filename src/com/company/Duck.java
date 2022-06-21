package com.company;

public class Duck{

    int size;
    private static int duckCount = 0;


    public Duck() {

        // use the parameter by default
        size = 27;
        System.out.println(size);
        duckCount++;


    }

    public Duck(int duckSize) {
        // use the parameter by user
        System.out.println("Quack wow");
        size = duckSize;
        System.out.println("size is " + size);


    }


/*
    public void setSize(int newSize) {

        size = newSize;

    }
    public void printSize() {

        System.out.println(size);


    }
*/


    
}

