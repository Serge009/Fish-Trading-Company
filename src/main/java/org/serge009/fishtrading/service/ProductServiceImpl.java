package org.serge009.fishtrading.service;

import org.serge009.fishtrading.core.dao.ProductDao;
import org.serge009.fishtrading.core.entity.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by oper4 on 04.11.2014.
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Inject
    private ProductDao productDao;

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public List<Product> findByKeyword(String keyword) {
        return productDao.findByKeyword(keyword);
    }
}
