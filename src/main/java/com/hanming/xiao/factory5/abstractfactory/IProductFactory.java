package com.hanming.xiao.factory5.abstractfactory;

import com.hanming.xiao.factory5.simplefactory.IProduct;

public interface IProductFactory {

    IProduct createProduct(int productNo);


}
