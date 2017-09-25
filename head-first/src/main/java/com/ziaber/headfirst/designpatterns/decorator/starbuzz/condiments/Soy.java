package com.ziaber.headfirst.designpatterns.decorator.starbuzz.condiments;

import com.ziaber.headfirst.designpatterns.decorator.starbuzz.beverages.Beverage;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + .15;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " Soy";
    }
}
