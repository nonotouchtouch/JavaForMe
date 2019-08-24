package com.hanming.xiao.reflect;

import java.lang.reflect.Method;

public class ReflectTest {

    public static void main(String args[]) throws Exception {
        sayHi();
        sayHiWithName("Mike");
        reflectMethod(new ReflectExample(),"sayHi");
        reflectMethod(new ReflectExample(),"sayHiWithName","Jay");


    }

    /**
     * 反射对象
     * @throws Exception
     */
    public static void sayHi()throws Exception{
        ReflectExample example = ReflectExample.getInstance();
        example.sayHi();
    }

    /**
     * 反射对象
     * @param name
     * @throws Exception
     */
    public static void sayHiWithName(String name) throws  Exception{
        ReflectExample example=ReflectExample.getInstance(name);
        example.sayHiWithName();
    }

    /**
     * 反射方法
     */
    public static void reflectMethod(Object object,String methodName) throws Exception{
        Method method=object.getClass().getMethod(methodName);
        method.invoke(object,null);

    }


    /**
     * 反射方法
     */
    public static void reflectMethod(Object object,String methodName,Object param) throws Exception{
        Method method=object.getClass().getMethod(methodName,param.getClass());
        method.invoke(object,param);

    }



}
