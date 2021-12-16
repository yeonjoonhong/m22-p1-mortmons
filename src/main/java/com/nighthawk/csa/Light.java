package com.nighthawk.csa;



public class Light {

    String seq;

    public Light(String seqq) {
        seq = seqq;
    }

    public String insertSegment(String segment, int id) {
        int x = id;
        String st=segment;
        seq = seq.substring(0,x) + segment + seq.substring(x, seq.length());
        return seq;
    }

    public void changeSequence(String seqq) {
        seq = seqq;
    }

    public String display() {
        return seq;
    }

}