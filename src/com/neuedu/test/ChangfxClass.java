package com.neuedu.test;

public class ChangfxClass {
    public static void main(String[] args) {
        changfx oRec1 = new changfx();
        System.out.println("默认长方形的周长为："+oRec1.getLength());
        System.out.println("默认长方形的面积为："+oRec1.getSquare());

        changfx oRec2= new changfx(2);
        System.out.println("默认长方形的周长为："+oRec2.getLength());
        System.out.println("默认长方形的面积为："+oRec2.getSquare());

        changfx oRec3= new changfx(3);
        System.out.println("默认长方形的周长为："+oRec3.getLength());
        System.out.println("默认长方形的面积为："+oRec3.getSquare());
    }
}