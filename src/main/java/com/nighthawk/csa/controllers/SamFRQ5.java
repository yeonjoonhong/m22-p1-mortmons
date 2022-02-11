package com.nighthawk.csa.controllers;

public class SamFRQ5 {
    private static String hostName;
    private String address;
    private String city;
    private int age;

    public SamFRQ5(String a, String b, String c, int d)
    {
        hostName = b;
        address = a;
        city = c;
        age = d;
    }

    public String getHostName()
    {
        return hostName;
    }

    public String getAddress()
    {
        return address;
    }

    public String getCity()
    {
        return city;
    }

    public int getAge()
    {
        return age;
    }


    public String setAddress(String ad)
    {
        address=ad;
        return address;
    }

    public String toString(String e)
    {
        return "Hello "+e+", this is my invitation for "+address+". My address is "+hostName+ "!";
    }
    public static void main(String[] args)
    {
        SamFRQ5 k = new SamFRQ5("James Harden","3525e", "Clevland", 22);
        k.setAddress("2323 Lebron Lane");
        String s=k.toString("Lebron");
        System.out.println(s);
    }

}
