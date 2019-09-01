package com.hanming.xiao.book.factory5.abstractfactory;

import com.hanming.xiao.book.factory5.simplefactory.IProduct;
import com.hanming.xiao.book.factory5.simplefactory.Product1;

public class ProductFactory1 implements IProductFactory {
    @Override
    public IProduct createProduct(int productNo) {
        IProduct product=new Product1();
        return product;
    }
}
