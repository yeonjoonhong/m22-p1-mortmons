package com.nighthawk.csa;



public class Lightfrq {

    String sequence;

    public Lightfrq(String seq) {
        sequence = seq;
    }

    public String insertSegment(String segment, int ind) {
        int x = ind;
        String st=segment;
        sequence = sequence.substring(0,x) + segment + sequence.substring(x, sequence.length());
        return sequence;
    }

    public void changeSequence(String seq) {
        sequence = seq;
    }

    public String display() {
        return sequence;
    }

}