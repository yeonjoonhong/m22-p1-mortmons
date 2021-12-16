package com.nighthawk.csa;



public class Light {

    String seqs;

    public Light(String seqq) {
        seqs = seqq;
    }

    public String insertSegment(String segment, int id) {
        int x = id;
        String st=segment;
        seqs = seqs.substring(0,x) + segment + seqs.substring(x, seqs.length());
        return seqs;
    }

    public void changeSequence(String seqq) {
        seqs = seqq;
    }

    public String display() {
        return seqs;
    }

}