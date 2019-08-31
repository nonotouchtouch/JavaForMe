package com.hanming.xiao.factory5.abstractfactory;

import com.hanming.xiao.factory5.simplefactory.IProduct;
import com.hanming.xiao.factory5.simplefactory.Product1;

public class ProductFactory1 implements IProductFactory {
    @Override
    public IProduct createProduct(int productNo) {
        IProduct product=new Product1();
        return product;
    }
}
