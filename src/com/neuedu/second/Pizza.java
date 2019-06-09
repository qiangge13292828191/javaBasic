package com.neuedu.second;

public class Pizza {
    private  int size;
    private double price;
    private  String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Pizza(){
        super();
    }
    public Pizza(int size,int price,String name){
        super();;
        this.size=size;
        this.price=price;
        this.name=name;
    }
    public String show(){
        return "这是制作披萨的方法";
    }

}
