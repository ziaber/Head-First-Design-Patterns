package com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients;

import com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggie[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void  prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
