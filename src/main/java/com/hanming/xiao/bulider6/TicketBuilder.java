package com.hanming.xiao.bulider6;

public class TicketBuilder {

    public static Object bulider(TickerHelper helper){
        System.out.println("通过ticketHelper构建套票信息");
        return null;
    }

    public static void main(String args[]){
        TickerHelper helper=new TickerHelper();
        helper.bulidAdult("");
        helper.bulidChildrenForSeat("");
        helper.bulidSoldier("");
        Object ticket=TicketBuilder.bulider(helper);
    }
}
