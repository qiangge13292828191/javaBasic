package com.neuedu.test;
import java.util.Scanner;

public class lianxiti10 {
    public static void main(String[] args) {
        //一个整数的各位数字之和能被 9 整除，则该数也能被 9 整除。编程验证给定的整数能否被 9 整除。
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数");
        int a = input.nextInt();
        int n=0;
        int c=a;
        while (a%10>0){
            n+=a%10;
            a=a/10;
        }
        n=n+a;
        if (n%9==0){
            System.out.println(c+"能被9整除");
        }else {
            System.out.println( c+"不能被9整除");
        }

    }

}

