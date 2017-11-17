package com.ziaber.headfirst.designpatterns.factory.pizza_factory_method;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + nyPizza.getName() + "\n");

        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + chicagoPizza.getName() + "\n");
    }
}
