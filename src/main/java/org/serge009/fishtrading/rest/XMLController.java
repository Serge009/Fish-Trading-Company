package org.serge009.fishtrading.rest;

import org.serge009.fishtrading.core.entity.Coffee;
import org.serge009.fishtrading.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

/**
 * Created by oper4 on 07.11.2014.
 */
@Controller
@RequestMapping("/xml")
public class XMLController {

    @Inject
    private ProductService productService;

    @RequestMapping(value="/products", method = RequestMethod.GET)
    public @ResponseBody ProductList getCoffeeInXML() {

        ProductList productList = new ProductList();
        productList.setProducts(productService.findAll());
        return productList;
    }

}
