package com.neuedu.second;


    public class Circle{
        public double radius;
        public double getRadius(){
            return radius;
        }
        public void setRadius(double r){
            radius=r;
        }
        public double caculatePerimeter(){
            return  3.14*2*radius;
        }
        public  double caculateArea(){
            return 3.14*radius*radius;
        }
    }

class Square{
    public double side;
    public double getSide(){
        return  side;
    }
    public void setSide(double l){
        side=l;
    }
    public double caculatePerimeter(){
        return 4*side;
    }
    public double caculateArea(){
        return side*side;
    }
}
    class Rectangcle {
        public double length;
        public double width;

        public double getLength() {
            return length;
        }

        public void setLength(double a) {
            length = a;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double b) {
            width = b;
        }

        public double caculatePerimeter() {
            return 2 * (length + width);
        }

        public double caculateArea() {
            return width * length;
        }
    }

