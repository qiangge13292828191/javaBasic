package com.neuedu.second;

public class Worker {
    private String name;
    private String sex;
    private String date;
    private int num;
    private Float salary;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void computeSalay(){
        System.out.println(num*salary);
    }

}
