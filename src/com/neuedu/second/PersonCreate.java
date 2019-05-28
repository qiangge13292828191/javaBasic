package com.neuedu.second;

public class PersonCreate {
    public static void main(String[] args) {
        Person zhangsan = new Person();
        zhangsan.name="zhangsna";
        zhangsan.height=1.73;
        zhangsan.age=33;

        Person lisi=new Person();
        lisi.name="lisi";
        lisi.height=1.74;
        lisi.age=44;

        zhangsan.sayHello();
        lisi.sayHello();

    }
}
