package com.imooc.product.service;

import com.imooc.product.domain.ProductCategory;

import java.util.List;

/**
 * @author 汪永晖
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
