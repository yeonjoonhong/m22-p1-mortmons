package com.nighthawk.csa;
import java.util.ArrayList;

// Write a Class Number (done)
public class Number {
    String squirrel = new String("Sq");
    String xnumber;
    int xsquirrelesValue;




    // instance variables (done)
    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Number(int squirrelesValue, String number ) {
        xsquirrelesValue = squirrelesValue;
        xnumber = number;
    }

    // It contains a getter for the Random Number


    // It contains a getter for Index, or the order it was initialized


    // Write a tester method
    public static void main(String[] args) {
        Number mySquirrel = new Number(6, "Squirrels");
        System.out.println(mySquirrel.xsquirrelesValue + " " + mySquirrel.xnumber);
        // Create an ArrayList of Type Number, my ArrayList is called squirrels

        // Initialize 10 squirrels of class type Number
        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops


        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop

    }

}

