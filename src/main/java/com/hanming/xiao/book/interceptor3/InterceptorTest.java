package com.hanming.xiao.book.interceptor3;

import com.hanming.xiao.book.proxy2.jdk.HelloWorld;
import com.hanming.xiao.book.proxy2.jdk.HelloWorldImpl;

public class InterceptorTest {
    public static void main(String args[]){
        HelloWorld proxy=(HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(),"com.hanming.xiao.interceptor3.MyInterceptor");

        proxy.sayHello();
    }
}
