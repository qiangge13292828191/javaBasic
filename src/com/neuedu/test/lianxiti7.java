package com.neuedu.test;
import java.util.Scanner;

public class lianxiti7 {
    public static void main(String[] args) {
        //判断一个年份是平年还是闰年
        Scanner input =new Scanner(System.in);
        System.out.println("输入年份");
        int a =input.nextInt();
        if(a%4==0&&a%100!=0||a%400==0){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }

    }
}
