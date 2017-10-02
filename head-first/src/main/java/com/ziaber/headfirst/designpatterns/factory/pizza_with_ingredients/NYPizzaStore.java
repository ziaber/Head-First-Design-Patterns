package com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients;

import com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.NYPizzaIngredientFactory;
import com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.PizzaIngredientsFactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientsFactory pizzaIngredientsFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientsFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (item.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientsFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }

}
