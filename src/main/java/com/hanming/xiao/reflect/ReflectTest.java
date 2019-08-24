package com.hanming.xiao.reflect;

public class ReflectTest {

    public static void main(String args[]) throws Exception {
        sayHi();
        sayHiWithName("Mike");

    }

    public static void sayHi()throws Exception{
        ReflectExample example = ReflectExample.getInstance();
        example.sayHi();
    }

    public static void sayHiWithName(String name) throws  Exception{
        ReflectExample example=ReflectExample.getInstance(name);
        example.sayHiWithName();
    }


}
