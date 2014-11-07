package org.serge009.fishtrading.rest;

import org.serge009.fishtrading.core.entity.Product;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by oper4 on 07.11.2014.
 */
@XmlRootElement(name = "products")
public class ProductList {

    private List<Product> products;

    @XmlElement(name = "product")
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
