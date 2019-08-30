package com.hanming.xiao.interceptor3;

import java.lang.reflect.Method;

public interface Interceptor {
    /**
     * 在真实对象前调用，true反射真实对象方法，false调用around方法
     * @param proxy 代理对象
     * @param target 真实对象
     * @param method 方法
     * @param args 方法入参
     * @return
     */
    boolean before(Object proxy, Object target, Method method, Object[] args);


    /**
     * before返回false调用around方法
     * @param proxy 代理对象
     * @param target 真实对象
     * @param method 方法
     * @param args 方法入参
     * @return
     */
    void around(Object proxy, Object target, Method method, Object[] args);

    /**
     * 最后调用after方法
     * @param proxy 代理对象
     * @param target 真实对象
     * @param method 方法
     * @param args 方法入参
     * @return
     */
    void after(Object proxy, Object target, Method method, Object[] args);

}
