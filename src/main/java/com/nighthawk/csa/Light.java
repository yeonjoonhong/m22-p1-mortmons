package com.nighthawk.csa;



public class Light {

    String sequences;

    public Light(String seqq) {
        sequences = seqq;
    }

    public String insertSegment(String segment, int id) {
        int x = id;
        String st=segment;
        sequences = sequences.substring(0,x) + segment + sequences.substring(x, sequences.length());
        return sequences;
    }

    public void changeSequence(String seqq) {
        sequences = seqq;
    }

    public String display() {
        return sequences;
    }

}