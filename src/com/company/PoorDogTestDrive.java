package com.company;

class PoorDog {

    private int size = 100;
    private String name = "who";

    public int getSize() {
        return size;
    }
    public String getName() {
        return name;
    }
}

public class PoorDogTestDrive {

    public static void main (String[] args) {

        PoorDog one = new PoorDog();
        System.out.println("Dog size is " + one.getSize());
        System.out.println("Dog name is " + one.getName());


        PoorDog a = new PoorDog();
        PoorDog b = new PoorDog();
        PoorDog c = a;
        if (a == b){
            System.out.println("a == b is true");
        }
        if (a == c) {
            System.out.println("a == c is true");
        }
        if (b == c) {
            System.out.println("b == c is true");
        }



    }
}
