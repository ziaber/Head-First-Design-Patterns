package com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients;

import com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.ChicagoPizzaIngredientFactory;
import com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.NYPizzaIngredientFactory;
import com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.PizzaIngredientsFactory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientsFactory pizzaIngredientsFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientsFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientsFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }

}
