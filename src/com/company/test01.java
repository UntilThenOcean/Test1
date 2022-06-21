package com.company;

public class test01 {

    public static void main(String[] arg) {

       String[] wordListOne = {"24/7", "multi-Tiger", "30,000 foot", "B-to-B", "win-win"};
       String[] wordListTwo = {"empowered", "sticky", "value-add", "oriented"};
       String[] wordListThree = {"process", "tipping-point", "solution", "arcitecture"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];


        System.out.println("What we need is a " + phrase);

    }
}
