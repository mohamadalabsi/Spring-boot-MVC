package org.me.learning.springmvc.service;

import org.me.learning.springmvc.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

//    we need a methode that return a list of products

    List<Product> products = Arrays.asList(new Product(101,"Iphone",4000),new Product(102,"Canon",6600),new Product(103,"AC",20000));

    public List < Product> getProduct() {
        return products;
    }
}
