package com.hanming.xiao.book.bulider6;

public class TickerHelper {

    public void bulidAdult(String info){
        System.out.println("构造成人票:"+info);
    }
    public void bulidChildrenForSeat(String info){
        System.out.println("构造有座儿童票:"+info);
    }
    public void bulidChildrenNoSeat(String info){
        System.out.println("构造无座儿童票票:"+info);
    }
    public void bulidElderly(String info){
        System.out.println("构造老年人票:"+info);
    }
    public void bulidSoldier(String info){
        System.out.println("构造军人票:"+info);
    }
}
