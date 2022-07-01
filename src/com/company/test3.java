package com.company;

public class test3 {

    public static void main(String[] arg){

    /*    for (int i = 0; i < 8; i++) {
            System.out.println(i);
        }
        System.out.println("Done.");*/
/*
        int i = 0;
        while (i<8) {
            System.out.println(i);
            i++;
        }
*/
/*
        int x,y,z;
        x = (int) Math.round(42.2);
        y = Math.min(25,10);
        z = Math.abs(-343);
        System.out.print(z);
*/

        String toTest  = "What is blue + yellow?/green";
        String[] result = toTest.split("/");
        for (String token:result) {
            System.out.println(token);
        }


    }


}
