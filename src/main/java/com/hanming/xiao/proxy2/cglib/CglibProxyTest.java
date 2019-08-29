package com.hanming.xiao.proxy2.cglib;

import com.hanming.xiao.reflect1.ReflectExample;

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
