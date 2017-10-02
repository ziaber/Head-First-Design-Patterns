package com.ziaber.headfirst.designpatterns.factory.pizza_with_ingredients.ingredients;

public interface PizzaIngredientsFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggie[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}