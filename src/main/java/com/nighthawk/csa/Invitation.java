package com.nighthawk.csa;


public class Invitation {
    private String hostName;
    private String address;

    public Invitation(String n, String a) {
        hostName = n;
        address = a;
    }

    // to return the hostname
    public String getHostName() {
        return hostName;
    }

    // to set the address
    public void setAddress(String newAddress) {
        address = newAddress;
    }

    // to generate the invitation from the given guestname
    public String generateInvitation(String guest) {
        String invite = "Dear " + guest + ", please attend my event at "
                + address + ".\nSee you then,\n" + hostName + ".";

        return invite;
    }

    // 1-arg constructor
    public Invitation(String address) {
        this.address = address;
        hostName = "Host";
    }

    public static void main(String[] args)
    {
        // some test cases
        Invitation i1 = new Invitation("Dana", "White House");
        i1.setAddress("1234 Daechi Street");
        System.out.println(i1.generateInvitation("Lorena"));

        Invitation i2 = new Invitation("1234 Daechi Street");
        System.out.println(i2.generateInvitation("John"));

    }

}






