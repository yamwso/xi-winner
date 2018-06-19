package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    List<ProductCategory> findAll();

    ProductCategory findOne(Integer categoryId);

    ProductCategory save(ProductCategory productCategory);
}
