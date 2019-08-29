package com.hanming.xiao.reflect1;

import java.lang.reflect.Method;

public class ReflectTest {

    public static void main(String args[]) throws Exception {
        sayHi();
        sayHiWithName("Mike");
        reflectMethod1(new ReflectExample(),"sayHi");
        reflectMethod2(new ReflectExample(),"sayHiWithName","Jay");

        Object name = reflectMethod3(new ReflectExample("Mike"),"getName");
        System.out.println(name);


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
    public static void reflectMethod1(Object object,String methodName) throws Exception{
        Method method=object.getClass().getMethod(methodName);
        method.invoke(object,null);

    }


    /**
     * 反射带入参的方法
     */
    public static void reflectMethod2(Object object,String methodName,Object param) throws Exception{
        Method method=object.getClass().getMethod(methodName,param.getClass());
        method.invoke(object,param);

    }


    /**
     * 反射带出参的方法
     */
    public static Object reflectMethod3(Object object,String methodName) throws Exception{
        Method method=object.getClass().getMethod(methodName);
        return method.invoke(object,null);

    }



}
