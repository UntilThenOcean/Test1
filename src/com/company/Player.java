package com.company;

public class Player {
    int  number = 0;
    static int playerCount = 0;
    private String name;

    public Player() {

        playerCount++;
    }

    public void guess() {
        number = (int) (Math.random() * 10); // 产生一个范围在10之内的随机数
        System.out.println("I'm guess " + number);
    }

}