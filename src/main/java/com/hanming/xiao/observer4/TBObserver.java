package com.hanming.xiao.observer4;

import java.util.Observable;
import java.util.Observer;

public class TBObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String newProduct = (String) arg;
        System.out.println("观察者TB: "+newProduct);
    }
}
