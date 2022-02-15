package com.nighthawk.csa.controllers;

import java.util.ArrayList;
import java.util.Random;

public class test {
    private static final String a = "squirrel 3";
    private static final String b = "squirrel 36";
    private static ArrayList<String> passList = new ArrayList<String>();

    public int passChar() {
        Random rand = new Random();
        int result = rand.nextInt(52);
        return result;
    }

    public int passNum() {
        Random rand = new Random();
        int result = rand.nextInt(20);
        return result;
    }

    public void passGen() {
        String tempString = "";
        for (int i = 1; i < 11; i++) {
            for (int l = 1; l < 8; l++) {
                tempString += a.charAt(passChar());
                tempString += b.charAt(passNum());
            }
            passList.add(tempString);
            tempString = "";
        }

        for (String s : passList) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        test c = new test();
        c.passGen();


    }

}
