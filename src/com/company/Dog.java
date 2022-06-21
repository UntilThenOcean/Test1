package com.company;

public class Dog extends Canine implements Pet {

    int size;
    String name;

    public Dog(String theName) {
        super(theName);
    }

    public static void main(String[] args) {

        // 创建Dog对象
        Dog dog1 = new Dog("four");
        dog1.name = "Bart";

        Dog d = new Dog("five");
        d.bark(3);

        // 创建Dog数组
        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog("six");
        myDogs[1] = new Dog("seven");
        myDogs[2] = dog1;

        // 通过数组引用存取Dog
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.println("last dog's name is ");
        System.out.println(myDogs[2].name);

        // 逐个对Dog执行bark()


    }

    void bark(int numOfBarks) {

        while (numOfBarks > 0) {
            System.out.println("ruff");
            numOfBarks = numOfBarks - 1;
        }

    }

    public void roam(){

    }


    @Override
    public void beFriendly() {

    }

    @Override
    public void play() {

    }
}
