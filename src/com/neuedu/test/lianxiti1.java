package com.neuedu.test;

public class lianxiti1 {
    public static void main(String[] args) {
       /* 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如： 153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
        1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
*/
        for (int i=1;i<10 ;i++ ) {
            for (int j=0;j<10 ;j++ ) {
                for (int m=0;m<10 ;m++ ) {
                    if ((i*100+j*10+m)==(i*i*i+j*j*j+m*m*m)) {
                        System.out.println(i*100+j*10+m);
                    }
                }
            }
        }
    }

    }
