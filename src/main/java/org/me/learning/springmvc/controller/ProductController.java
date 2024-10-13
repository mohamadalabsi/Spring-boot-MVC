package org.me.learning.springmvc.controller;



//the is responsible to accept the request for the products

import org.me.learning.springmvc.model.Product;
import org.me.learning.springmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;


    @RequestMapping("/products")
    public List<Product> getProducts(){
        return productService.getProduct();
    }




}
