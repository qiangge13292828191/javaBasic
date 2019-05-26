package com.neuedu.test;
import java.util.Scanner;

public class lianxiti6 {
    public static void main(String[] args) {
        //一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
        Scanner a = new Scanner(System.in);
        System.out.println("请输入一个5位数");
        int i =a.nextInt();
        if(i%10==i/10000&&i%100/10==i%10000/1000){
            System.out.println(i+"是一个回文数");
        }
    }
}
