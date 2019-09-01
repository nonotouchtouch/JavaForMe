package com.hanming.xiao.book.proxy2.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyExample implements MethodInterceptor {

    public Object getProxy(Class clz){
        //CGLIB 增强类对象
        Enhancer enhancer=new Enhancer();
        //设置增强类型
        enhancer.setSuperclass(clz);
        //定义代理逻辑对象为当前对象，要求当前对象实现MethodInterceptor
        enhancer.setCallback(this);
        //生成并返回代理对象
        return enhancer.create();
    }

    /**
     * 代理逻辑方法
     * @param o 代理对象
     * @param method 方法
     * @param args 方法参数
     * @param methodProxy 方法代理
     * @return 代理逻辑返回
     * @throws Throwable 异常
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用真实对象前》》》》》》》》》》》》》");
        //反射调用真实对象方法
        Object result=methodProxy.invokeSuper(o,args);
        System.out.println("调用真实对象后》》》》》》》》》》》》》");
        return result;
    }
}
