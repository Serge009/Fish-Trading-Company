package org.serge009.fishtrading.web.beans;

import org.serge009.fishtrading.core.entity.Product;
import org.serge009.fishtrading.service.ProductService;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matrix on 05.11.2014.
 */
@Named
@Scope("request")
public class ProductsBean {

    @Inject
    private ProductService productService;

    private List<Product> products = new ArrayList<>();

    @PostConstruct
    private void init() {
        products = productService.findAll();
    }

    public void search() {
        this.products = productService.findByKeyword("Product 1");
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
