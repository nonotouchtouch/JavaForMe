package com.hanming.xiao.book.proxy2.jdk;

public class JDKProxyTest {
    public static void main(String args[]){
        testJdkProxy();
    }

    public static void testJdkProxy(){
        JDKProxyExample jdk=new JDKProxyExample();
        HelloWorld proxy=(HelloWorld) jdk.bind(new HelloWorldImpl());
        proxy.sayHello();
    }
}
