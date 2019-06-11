package com.neuedu.second;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add(new ArrayTest("鲁迅"+"   ","山阴路"+"   ","上海"+"     ","上海"+"     ","中国"));
        l.add(new ArrayTest("李白"+"   ","青莲镇"+"   ","绵阳江油"+"   ","四川"+"   ","中国"));
        l.add(new ArrayTest("杜甫"+"   ","站街镇"+"   ","巩义市"+"   ","河南"+"     ","中国"));

        for(int i=0;i<l.size();i++)
        {
            ArrayTest p=(ArrayTest)l.get(i);
            System.out.println(p.name + p.jiedao + p.chengshi+p.shengfen+p.country);
        }
    }

}

