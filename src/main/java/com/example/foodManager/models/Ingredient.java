package com.example.foodManager.models;


import com.example.foodManager.interfaces.ObjectWithCanHavePrice;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="ingredients")
public class Ingredient implements ObjectWithCanHavePrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String name;

    @OneToMany
    private Set<RegisterOfPrices> listOfPrices;


    public void setListOfPrices(RegisterOfPrices lastPriceRegistration) {
        this.listOfPrices.add(lastPriceRegistration);
    }
}
