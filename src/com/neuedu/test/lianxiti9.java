package com.neuedu.test;

public class lianxiti9 {
    public static void main(String[] args) {
        //用 while 循环，计算 1~200 之间所有 3 的倍数之和。
        int a=0;
        int i=1;
        while (i<200){
            if(i%3==0){
                a=a+i;
            }
            i++;
        }
        System.out.println("和为"+a);
    }
}
