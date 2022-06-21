package com.company;

abstract public class Animal {

    public void makeNoise() {}

    public void eat() {}

    public void sleep() {}

    public abstract void roam();

    private String name;

    public String getName() {
        return name;
    }

    public Animal(String theName) {
        name = theName;
    }

    public static class MyAnimalList {

        private Animal [] animals = new Animal[5];
        private int nextIndex = 0;

        public void add(Animal d) {
            if (nextIndex < animals.length) {
                animals[nextIndex] = d;
                System.out.println("Animal added at " + nextIndex);
                nextIndex++;
            }
        }
    }


}


