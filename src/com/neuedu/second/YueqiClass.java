package com.neuedu.second;

public class YueqiClass {
    public static void main(String[] args) {
        Musician m=new Musician();
        Instrument i1=new Wind();
        m.play(i1);
        System.out.println("wwwwwwww");

        Instrument i2=new Brass();
        m.play(i2);
        System.out.println("sdddddd");

    }
}
