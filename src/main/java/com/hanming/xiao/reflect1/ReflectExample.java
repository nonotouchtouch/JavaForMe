package com.hanming.xiao.reflect1;

public class ReflectExample {


    /**
     * 构造方法
     */
    public ReflectExample(){ }

    /**
     * 带参构造方法
     */
    public ReflectExample(String name){
        this.name=name;
    }



    /**
     * 变量
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return (ReflectExample) Class.forName("com.hanming.xiao.reflect1.ReflectExample").newInstance();
    }

    /**
     * 用于获取对象
     * 使用带参数的构造方法
     * @return
     * @throws Exception
     */
    public static ReflectExample getInstance(String name) throws Exception{
        return (ReflectExample) Class.forName("com.hanming.xiao.reflect1.ReflectExample").
                getConstructor(String.class).newInstance(name);
    }
}
