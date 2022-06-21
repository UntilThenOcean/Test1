package com.company;

import java.io.File;

public class Filetest {

    public static void main(String[] args) {
        File f = new File("Mycode.txt");
        File dir = new File("Chatpter7");
        dir.mkdir();

        System.out.println(dir.getAbsolutePath());

        boolean idDeleted = f.delete();
    }
}
