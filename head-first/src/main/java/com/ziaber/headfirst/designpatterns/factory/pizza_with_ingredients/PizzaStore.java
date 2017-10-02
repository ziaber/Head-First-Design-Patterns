package com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients;

public abstract class PizzaStore {

    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
