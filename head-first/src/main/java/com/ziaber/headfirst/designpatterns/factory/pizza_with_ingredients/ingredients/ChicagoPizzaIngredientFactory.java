package com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients;

import static com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.Cheese.*;
import static com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.Clams.*;
import static com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.Dough.*;
import static com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.Pepperoni.SLICED_PEPPERONI;
import static com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.Sauce.*;
import static com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.Veggie.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientsFactory {
    @Override
    public Dough createDough() {
        return THICK_CRUST_DOUGH;
    }

    @Override
    public Sauce createSauce() {
        return TOMATO_SAUCE;
    }

    @Override
    public Cheese createCheese() {
        return MOZZARELLA;
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{SPINACH, BLACK_OLIVES};
    }

    @Override
    public Pepperoni createPepperoni() {
        return SLICED_PEPPERONI;
    }

    @Override
    public Clams createClam() {
        return FROZEN_CLAMS;
    }
}
