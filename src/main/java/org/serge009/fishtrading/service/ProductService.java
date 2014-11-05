package org.serge009.fishtrading.service;

import org.serge009.fishtrading.core.entity.Product;

import java.util.List;

/**
 * Created by oper4 on 04.11.2014.
 */
public interface ProductService {
    public List<Product> findAll();

    public List<Product> findByKeyword(String keyword);
}
