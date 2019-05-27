package com.neuedu.test;

public class JisuanjiClass {
    public static void main(String[] args) {
        jisuanqi oJi=new jisuanqi(4,2);
        System.out.println("两数之和为："+oJi.getAdd());
        System.out.println("两数之差为："+oJi.getSub());
        System.out.println("两数之积为："+oJi.getMul());
        System.out.println("两数之商为：");
        oJi.getDev();
    }
}
