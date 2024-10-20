package org.me.learning.springmvc.service;

import org.me.learning.springmvc.model.Product;
import org.me.learning.springmvc.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
//    the job of the Service tho calculate and processing  and these stuff

//    we need a methode that return a list of products

    //    asList is limited list
//    List<Product> products = Arrays.asList(new Product(101,"Iphone",4000),new Product(102,"Canon",6600),new Product(103,"AC",20000));
//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 4000), new Product(102, "Canon", 6600), new Product(103, "AC", 20000)));
// we do not need that anymore , we will use the DB

    @Autowired
    ProductRepo repo;





    //!    now getting product = get
    public List<Product> getProduct() {
//        return products;
        return repo.findAll();
    }

    public Product getproductByID(int prodID) {
//        return products.stream().filter(p -> p.getProdID() == prodID)
//                .findFirst().get();
//                        .orElse(new Product(104,"samsung AC",40540)): if you provide id that does not exist you can handel it this way , but not the best way

        return repo.findById(prodID).orElse(new Product());

    }

    //!    now adding product = post
    public void addProduct(Product prod) {
//        products.add(prod);
        repo.save(prod);
    }

    //!    now update product = put
    public void updateProduct(Product prod) {
//        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProdID() == prod.getProdID()) {
//                index = i;
//            }
//
//        }
//        products.set(index, prod);
        repo.save(prod);//it works for saving and updating

    }

    //!    now delete product = delete
    public void deleteProduct(int prodID) {  // using the same code in two different methods is not a good idea , u can instead make a common method
//        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProdID() == prodID) {
//                index = i;
//            }
//
//        }
//        products.remove(index);
        repo.deleteById(prodID);
    }
}