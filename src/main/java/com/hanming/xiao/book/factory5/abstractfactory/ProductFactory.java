package com.hanming.xiao.book.factory5.abstractfactory;

import com.hanming.xiao.book.factory5.simplefactory.IProduct;

public class ProductFactory implements IProductFactory {
    @Override
    public IProduct createProduct(int productNo) {
        if(1==productNo){
            return new ProductFactory1().createProduct(productNo);
        }
        return null;
    }
}
