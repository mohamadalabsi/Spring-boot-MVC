package org.me.learning.springmvc.model;


//import lombok.AllArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Data
//@AllArgsConstructor //it will make a constructor for me
@Component
@Entity
public class Product {

    @Id
    private int prodID;
    private String prodName;
    private int prodPrice;

//    instead of making getters and setters by our self , i can use lombok library to do that


    public Product() {

    }

    public Product(int prodID, String prodName, int prodPrice) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }
}
