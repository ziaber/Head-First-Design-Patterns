package com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients;

import static com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.Cheese.REGGIANO_CHEESE;
import static com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.Clams.FRESH_CLAMS;
import static com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.Dough.THICK_CRUST_DOUGH;
import static com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.Pepperoni.SLICED_PEPPERONI;
import static com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.Sauce.MARINARA_SAUCE;
import static com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients.Veggie.*;

public class NYPizzaIngredientFactory implements PizzaIngredientsFactory {
    @Override
    public Dough createDough() {
        return THICK_CRUST_DOUGH;
    }

    @Override
    public Sauce createSauce() {
        return MARINARA_SAUCE;
    }

    @Override
    public Cheese createCheese() {
        return REGGIANO_CHEESE;
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{ONION, MASHROOM, RED_PEPPER};
    }

    @Override
    public Pepperoni createPepperoni() {
        return SLICED_PEPPERONI;
    }

    @Override
    public Clams createClam() {
        return FRESH_CLAMS;
    }
}
