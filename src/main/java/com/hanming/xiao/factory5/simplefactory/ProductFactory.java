package com.hanming.xiao.factory5.simplefactory;

public class ProductFactory {

    public static IProduct createProduct(int productNo){
        switch (productNo){
            case 1:return new Product1();
            case 2:return new Product2();
            default:return null;
        }
    }
}
