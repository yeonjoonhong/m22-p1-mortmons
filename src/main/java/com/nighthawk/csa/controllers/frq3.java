package com.nighthawk.csa.controllers;

public class frq3{
    private String yesorno;
    private boolean rsvp;
    public String option1;
    private int selection;



    public frq3(String boo, int a){
        yesorno = boo;
        selection = a;

    }
    public boolean check(){
        if(yesorno == "y"){
            rsvp = true;
        }
        else if(yesorno == "n"){
            rsvp = false;
        }
        return rsvp;
    }
    public void attending(boolean rsvp){
        if(rsvp){
            System.out.println("coming");
        }
        else {
            System.out.println("not coming");
            System.exit(0);
        }
    }
    public void meal(int selection){
        if(selection == 1){
            option1 = "Thanks for coming. You will get chips and salsa.";
        }
        else if(selection == 2){
            option1 = "Thanks for coming. You will get rocky mountain oysters.";
        }
        else if(selection == 3){
            option1 = "Thanks for coming. You will get lamb.";
        }
        else{
            option1 = "Thanks for coming. You will get water";
        }
        System.out.println(option1);
    }
}