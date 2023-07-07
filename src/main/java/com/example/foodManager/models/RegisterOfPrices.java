package com.example.foodManager.models;


import com.example.foodManager.interfaces.ObjectWithCanHavePrice;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="registerOfPrices")
public class RegisterOfPrices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    private double price;

    @Temporal(TemporalType.DATE)
    public Date dateOfCreationOfPrice;

    private String moneyIdentifier;

    @ManyToOne
    public ObjectWithCanHavePrice objectOfRelatedPrice;

    public ObjectWithCanHavePrice getObjectOfRelatedPrice() {
        return objectOfRelatedPrice;
    }

    public void setObjectOfRelatedPrice(ObjectWithCanHavePrice objectOfRelatedPrice) {
        this.objectOfRelatedPrice = objectOfRelatedPrice;
    }

    public String getMoneyIdentifier() {
        return moneyIdentifier;
    }

    public void setMoneyIdentifier(String moneyIdentifier) {
        this.moneyIdentifier = moneyIdentifier;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws Exception {
        if(price>=0){
            this.price = price;
        }
        throw new Exception("Not is possible create a negative price");

    }
}
