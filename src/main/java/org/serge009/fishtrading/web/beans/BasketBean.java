package org.serge009.fishtrading.web.beans;

import org.serge009.fishtrading.core.entity.Product;
import org.serge009.fishtrading.service.ProductService;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by oper4 on 04.11.2014.
 */
@Named
@Scope("session")
public class BasketBean {

    @Inject
    private ProductService productService;

    private List<Product> productList = new ArrayList<>();

    //@PostConstruct
    private void init() {
        this.productList = productService.findAll();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        productList.add(product);

        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage(null, new FacesMessage("Successful",  "Added!"));
    }
}
