package com.imooc.product.repository;

import com.imooc.product.domain.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.ArrayList;
import java.util.List;


/**
 * @author 汪永晖
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> categoryTypeList = new ArrayList<>();
        categoryTypeList.add(11);
        categoryTypeList.add(22);
        List<ProductCategory> list = productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
        Assert.assertTrue(list.size() > 0);
    }
}