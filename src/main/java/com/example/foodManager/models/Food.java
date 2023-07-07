package com.example.foodManager.models;

import com.example.foodManager.interfaces.ObjectWithCanHavePrice;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="food")
public class Food implements ObjectWithCanHavePrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    public String name;

    @ManyToMany
    public Set<Ingredient> listOfIngredients;

    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
}
