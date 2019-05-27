package com.neuedu.test;

public class yuan {
    private double radius;
    public yuan(double dRadius){
        this.radius=dRadius;
    }
    public double getLength(){
        return 2*Math.PI*this.radius;
    }
    public double getArea(){
        return  Math.PI*this.radius*this.radius;
    }
}
