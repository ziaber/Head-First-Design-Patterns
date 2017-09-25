package com.ziaber.headfirst.designpatterns.decorator.starbuzz;

import com.ziaber.headfirst.designpatterns.decorator.starbuzz.beverages.Beverage;
import com.ziaber.headfirst.designpatterns.decorator.starbuzz.beverages.Espresso;
import com.ziaber.headfirst.designpatterns.decorator.starbuzz.beverages.HouseBlend;
import com.ziaber.headfirst.designpatterns.decorator.starbuzz.condiments.Mocha;
import com.ziaber.headfirst.designpatterns.decorator.starbuzz.condiments.Soy;
import com.ziaber.headfirst.designpatterns.decorator.starbuzz.condiments.Whip;

public class StarbuzzCoffee {
    public static void main(String args[]) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription()
                + " " + espresso.getCost());

        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        beverage = new Soy(beverage);

        System.out.println(beverage.getDescription() + " " + beverage.getCost());


    }
}
