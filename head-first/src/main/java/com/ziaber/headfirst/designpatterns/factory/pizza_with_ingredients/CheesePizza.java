package com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients;

import com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.PizzaIngredientsFactory;

public class CheesePizza extends Pizza {
    private PizzaIngredientsFactory pizzaIngredientsFactory;

    public CheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        this.dough = this.pizzaIngredientsFactory.createDough();
        this.sauce = this.pizzaIngredientsFactory.createSauce();
        this.cheese = this.pizzaIngredientsFactory.createCheese();
    }
}
