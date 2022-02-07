package com.nighthawk.csa;

import java.util.Scanner;  // Import the Scanner class


import java.util.Scanner;  // Import the Scanner class

class FRQTHREE {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter if you are attending (yes or no)");

        String attending = myObj.nextLine();  // Read user input
        System.out.println("you are attending " + attending)
        ;  // Output user input
        System.out.println("What food are you going to eat?  1 represents beef, 2 represents chicken, 3 represents pasta, and all other values represent fish");
        int food = myObj.nextInt();
        if( food == 1 ){
            System.out.println("Beef");
        }
        if(food == 2 )
        {
            System.out.println("chicken");
        }
        if(food == 3 ){
            System.out.println("pasta");
        }
        if(food >= 4){
            System.out.println("fish");
        }

    }

    //
}