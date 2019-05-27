package com.neuedu.test;

public class jisuanqi {
    private int a;
    private int b;

    public jisuanqi(int a1, int b1) {
        this.a = a1;
        this.b = b1;
    }

    public int getAdd() {
        return this.a + this.b;
    }

    public int getSub() {
        return this.a - this.b;
    }

    public int getMul() {
        return this.a * this.b;
    }

    public void getDev() {
        if (this.a == 0) {
            System.out.print("分子不能为零！");
        } else {
            System.out.print(this.a/this.b);
        }
    }
}