package com.hanming.xiao.book.proxy2.cglib;

import com.hanming.xiao.book.reflect1.ReflectExample;

public class CglibProxyTest  {
    public static void main(String args[]){

        testCglibProxy();

    }
    public static void testCglibProxy(){
        CglibProxyExample cglibProxyExample=new CglibProxyExample();
        ReflectExample reflectExample=(ReflectExample) cglibProxyExample.getProxy(ReflectExample.class);

        reflectExample.sayHi();
    }

}
