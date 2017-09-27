package com.ziaber.headfirst.designpatterns.factory.pizza_factory_method;

public class CaliforniaStyleCheesePizza extends Pizza {
    public CaliforniaStyleCheesePizza() {
        name = "California Style Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "California Sauce";
        toppings.add("Tomato with cucumber");
    }
}
