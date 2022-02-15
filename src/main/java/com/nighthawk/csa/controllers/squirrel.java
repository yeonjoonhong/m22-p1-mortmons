package com.nighthawk.csa.controllers;
// unit 5 FRQ
public class squirrel {
    private static String hostName;
    private String address;
    private String city;
    private int age;

    public squirrel(String a, String b, String c, int d)
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
        return "Squirrels: 36 Day 1,    "+e+",    Squirrels: 19 Day: 8,     "+address+",    Squirrels: 32 Day: 4,     "+hostName+    "Squirrels: 40 ";
    }
    public static void main(String[] args)
    {
        squirrel k = new squirrel("Day: 7","Day:6", "Day: 4", 22);
        k.setAddress("Squirrels: 34 Day: 3");
        String s=k.toString("Squirrels: 8 Day: 0");
        System.out.println(s);
    }

}

