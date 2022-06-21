package com.company;

import java.util.ArrayList;

public class AnimalTestDrive {
    public static void main(String[] args) {

        Animal.MyAnimalList list = new Animal.MyAnimalList();
        Dog a = new Dog("Petter");
        Cat c = new Cat("Tom");
        System.out.println(c.getName());
        System.out.println(a.getName());
        /*list.add(a);
        list.add(c);
        System.out.println(c.hashCode());
        System.out.println(a.hashCode());

        System.out.println("C.getclass():" + c.getClass());
        System.out.println("a.getclass():" + a.getClass());
        System.out.println("\n");
        System.out.println("C.toString():" + c.toString());
        System.out.println("a.toString():" + a.toString());
        */

        ArrayList<Dog> myDogArrayList = new ArrayList<Dog>();
        Dog aDog = new Dog("wow");
        myDogArrayList.add(aDog);
        Dog d = myDogArrayList.get(0);

        Dog s = new Dog("three");
        Object o = s;
        //Dog b = (Dog) o;







    }


}
