package com.hanming.xiao.book.observer4;

import java.util.Observable;
import java.util.Observer;

public class JDObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String newProduct=(String) arg;
        System.out.println("观察者JD: "+newProduct);
    }
}
