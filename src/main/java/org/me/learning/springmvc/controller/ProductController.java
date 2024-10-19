package org.me.learning.springmvc.controller;



//the is responsible to accept the request for the products


import org.me.learning.springmvc.model.Product;
import org.me.learning.springmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
//    the job of the controller is to send and handel the request
    @Autowired
    ProductService productService;
//?     the data will be converted from Object to json and the other way around automatically using the library jackson
//!     GET
    @RequestMapping("/products")   // by default this annotation will use GET method
    public List<Product> getProducts(){
        return productService.getProduct();
    }


//     searching about specific ID
//    @RequestMapping("/products/{prodID}") // to make it dynamic
    @GetMapping("/products/{prodID}")
    public Product getProductByID(@PathVariable int prodID){ //you have to use this annotation because we want to match it now
         return productService.getproductByID(prodID);
    }

//!    POST

//    @RequestMapping()
    @PostMapping ("/products")
   public void  addProduct(@RequestBody Product product){ // we use RequestBody if u send a body from the client to the server , to get the data from request
        productService.addProduct(product);
   }

//!    PUT
    @PutMapping ("/products")
    public void  updateProduct(@RequestBody Product product){ // we use RequestBody if u send a body from the client to the server , to get the data from request
        productService.updateProduct(product);
    }


    //!    DELETE
    @DeleteMapping ("/products/{prodID}")
    public void  deleteProduct(@PathVariable int prodID){ // we use RequestBody if u send a body from the client to the server , to get the data from request
        productService.deleteProduct(prodID);
    }

}
