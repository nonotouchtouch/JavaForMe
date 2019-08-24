package com.hanming.xiao.reflect;

public class ReflectExample {

    private String name;

    /**
     * 构造方法
     */
    public ReflectExample(){ }

    /**
     * 构造方法
     */
    public ReflectExample(String name){
        this.name=name;
    }

    public void sayHi(){
        System.out.println("Hi~");
    }

    public void sayHiWithName(){
        System.out.println("Hi, " + this.name +".");
    }

    public void sayHiWithName(String name){
        System.out.println("Hi, " + name +".");
    }


    /**
     * 用于获取对象
     * newInstance相当于调用了无参的构造方法
     * @return
     * @throws Exception
     */
    public static ReflectExample getInstance() throws Exception{
        return (ReflectExample) Class.forName("com.hanming.xiao.reflect.ReflectExample").newInstance();
    }

    /**
     * 用于获取对象
     * 使用带参数的构造方法
     * @return
     * @throws Exception
     */
    public static ReflectExample getInstance(String name) throws Exception{
        return (ReflectExample) Class.forName("com.hanming.xiao.reflect.ReflectExample").
                getConstructor(String.class).newInstance(name);
    }
}
