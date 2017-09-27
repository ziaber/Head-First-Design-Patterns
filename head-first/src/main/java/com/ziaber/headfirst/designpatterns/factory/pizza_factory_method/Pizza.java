package com.ziaber.headfirst.designpatterns.factory.pizza_factory_method;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + this.name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        this.toppings.forEach(o -> System.out.println(" " + o));
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza_factory_method into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza_factory_method in official PizzaStore box");
    }

    String getName() {
        return name;
    }

}
