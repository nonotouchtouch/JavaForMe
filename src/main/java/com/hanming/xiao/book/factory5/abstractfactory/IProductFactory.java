package com.hanming.xiao.book.factory5.abstractfactory;

import com.hanming.xiao.book.factory5.simplefactory.IProduct;

public interface IProductFactory {

    IProduct createProduct(int productNo);


}
