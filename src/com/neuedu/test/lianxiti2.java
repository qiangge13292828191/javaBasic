package com.neuedu.test;
import java.util.Scanner;

public class lianxiti2 {
    public static void main(String[] args) {
        //题目：利用条件运算符的嵌套来完成此题：
        // 学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下 的用C表示。
        Scanner input =new Scanner(System.in);
        int c =input.nextInt();

                    if(c>=90){
                        System.out.println("A");
                    }else if(c<=89&&c>=60){
                        System.out.println("B");
                    }else{
                        System.out.println("C");
        }
    }
}