package com.hanming.xiao.proxy2.jdk;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
