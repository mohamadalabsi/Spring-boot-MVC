package org.me.learning.springmvc.repository;


import org.me.learning.springmvc.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
// all the methods we use in the ProductService class from this interface and specifically from the interface parent JpaRepository 

}
