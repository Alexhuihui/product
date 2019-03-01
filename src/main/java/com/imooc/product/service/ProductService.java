package com.imooc.product.service;

import com.imooc.product.domain.ProductInfo;

import java.util.List;

/**
 * @author 汪永晖
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     *
     * @return
     */
    List<ProductInfo> findUpAll();
}
