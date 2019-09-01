package com.hanming.xiao.book.proxy2.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyExample implements InvocationHandler {
    /**
     * 真正干活的人（对象）
     */
    private Object worker;

    /**
     *  建立关系
     * @param worker 真实对象
     * @return 代理对象
     */
    public Object bind(Object worker){
        this.worker=worker;
        return Proxy.newProxyInstance(worker.getClass().getClassLoader(),worker.getClass().getInterfaces(),this);
    }

    /**
     *
     * 代理方法逻辑（就是在真实方法前后加入自己的逻辑）
     * @param proxy 代理对象
     * @param method 当前调度方法
     * @param args 当前方法参数
     * @return 代理结果返回
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理逻辑方法.");
        System.out.println("模拟代理开始逻辑》》》》》》》》》》》》》》》》》》》");
        Object object=method.invoke(worker,args);
        System.out.println("模拟代理结束逻辑》》》》》》》》》》》》》》》》》》》");
        return object;
    }
}
