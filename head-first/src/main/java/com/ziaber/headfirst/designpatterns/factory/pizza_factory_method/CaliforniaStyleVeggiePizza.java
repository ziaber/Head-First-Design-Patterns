package com.ziaber.headfirst.designpatterns.factory.pizza_factory_method;

public class CaliforniaStyleVeggiePizza extends Pizza {
    public CaliforniaStyleVeggiePizza() {
        name = "California Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "California Sauce";
        toppings.add("Tomato with cucumber");
    }
}
