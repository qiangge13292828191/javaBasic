package com.neuedu.test;

        public class CarExercise {
            public static void main(String[] args) {
//实现两个对象
                SubCar bmw = new SubCar("bmw",100,80);
                SubCar benz = new SubCar("benz",110,90);

                System.out.println(bmw);
                bmw.drive();
                bmw.speedChange(200);

                System.out.println(benz);
                benz.drive();
                benz.speedChange(250);
            }

        }

//子类继承父类
        class SubCar extends Car {
            private int price;
            private int speed;

            SubCar(){

            }

            SubCar(String mark,int price,int speed){
                super(mark);
                this.price = price;
                this.speed = speed;
            }

            public void speedChange(int speed){
                System.out.println(getMark() + "现在变速为：" + speed);
                setSpeed(speed);
            }


            @Override
            public String toString() {
                return "我是" + getMark() + ",我的价格是：" + price + ", 我现在的速度是：" + speed;
            }

            public int getPrice() {
                return price;
            }
            public void setPrice(int price) {
                this.price = price;
            }
            public int getSpeed() {
                return speed;
            }
            public void setSpeed(int speed) {
                this.speed = speed;
            }
        }

//父类
        class Car{
            private String mark;
            Car(){

            }
            Car(String mark){
                this.mark = mark;
            }
            public void drive(){
                System.out.println(getMark() + "正在行驶。。。。");
            }
            public String getMark() {
                return mark;
            }

            public void setMark(String mark) {
                this.mark = mark;
            }
        }

