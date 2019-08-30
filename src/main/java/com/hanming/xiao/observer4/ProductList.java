package com.hanming.xiao.observer4;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式--被观察者
 */
public class ProductList extends Observable {
    /**
     * 产品列表
     */
    private List<String> productList;

    /**
     * 唯一实例
     */
    private static ProductList instance;

    private ProductList(){}

    /**
     * 获取唯一实例，单例模式
     * @return
     */
    public static ProductList getInstance(){
        if(null==instance){
            instance=new ProductList();
            instance.productList=new ArrayList<>();
        }
        return instance;
    }

    public void addProductListObserver(Observer observer){
        this.addObserver(observer);
    }

    /**
     * 新增产品
     * @param newProduct
     */
    public void addProduct(String newProduct){
        productList.add(newProduct);
        System.out.println("增加了新产品："+newProduct);
        this.setChanged();
        //通知观察者
        this.notifyObservers(newProduct);
    }




}
