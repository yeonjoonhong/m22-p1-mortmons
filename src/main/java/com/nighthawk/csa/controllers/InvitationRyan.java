package com.nighthawk.csa.controllers;

public class InvitationRyan {
    private static String hostName;
    private String address;
    private String city;
    private int age;

    public InvitationRyan(String a, String b, String c, int d)
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
        return "Yo "+e+", please come to my party at "+address+". My address is "+hostName+ "!";
    }
    public static void main(String[] args)
    {
        InvitationRyan k = new InvitationRyan("Lebron","2323 James Lane", "Clevland", 22);
        k.setAddress("2323 Lebron Lane");
        String s=k.toString("Lebron");
        System.out.println(s);
    }

}
