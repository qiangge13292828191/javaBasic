package com.neuedu.second;

public class Point {
    int x;
    int y;
    Point(){
        System.out.println(x);
        System.out.println(y);
    }
    Point(int x,int y){
        x=x;
        y=y;
        System.out.println(x);
        System.out.println(y);
    }
    void movePoint(int p1,int p2){
        p1=x+10;
        p2=y+10;
        System.out.println("p1的坐标为"+p1+"\n"+"p2的坐标为"+p2);
    }
}
