package com.nighthawk.csa.controllers;

public class frq4{
    public static String longestStreak(String str){

        char previousChar = ' ';

        String largestStreak = "", currentStreak = "";

        for (int i = 0; i < str.length(); i++){

            if (str.charAt(i) != previousChar){

                currentStreak = "";

            }

            currentStreak += str.charAt(i);


            if (currentStreak.length() > largestStreak.length()){

                largestStreak = currentStreak;

            }

            previousChar = str.charAt(i);

        }

        return (largestStreak.charAt(0)+" "+largestStreak.length());
    }
}
