package com.hanming.xiao.observer4;

public class ObserverTest {
    public static void main(String args[]) {
        ProductList observable=ProductList.getInstance();

        TBObserver tbObserver=new TBObserver();
        JDObserver jdObserver=new JDObserver();

        observable.addObserver(jdObserver);
        observable.addObserver(tbObserver);

        observable.addProduct("Coco");

    }
}
