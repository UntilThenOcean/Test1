package com.company;

public class GoodDog {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Woof! Woof!");

        }else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        }else {
            System.out.println("Yip! Yip!");
        }
    }

}

class GoodDogTestDrive {

    public static void main (String[] args) {

        /*GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Dog one:" + one.getSize());
        System.out.println("Dog two:" + two.getSize());

        one.bark();
        two.bark();*/

        // 声明一个装载7个Dog引用的Dog数组
        GoodDog[] pets;
        pets = new GoodDog[7];

        // 创建两个Dog对象并赋值为数组的前两项元素
        pets[0] = new GoodDog();
        pets[1] = new GoodDog();

        // 调用这两个Dog对象的方法
        pets[0].setSize(30);
        int x = pets[0].getSize();
        pets[1].setSize(8);
        System.out.println("pets[0]:" + pets[0].getSize());
        System.out.println("pets[1]:" + pets[1].getSize());
        System.out.println("x:" + x);


    }
}
