package org.serge009.fishtrading.rest;

import org.serge009.fishtrading.core.entity.Product;
import org.serge009.fishtrading.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Matrix on 05.11.2014.
 */
@Controller
public class ProductController {

    @Inject
    private ProductService productService;

    @RequestMapping("/products")
    public @ResponseBody List<Product> getAllProducts() {
        return productService.findAll();
    }
}
