package com.imooc.product.service.impl;

import com.imooc.product.domain.ProductInfo;
import com.imooc.product.enums.ProductStatusEnum;
import com.imooc.product.repository.ProductInfoRepository;
import com.imooc.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 汪永晖
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    /**
     * 查询所有在架商品列表
     *
     * @return
     */
    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
