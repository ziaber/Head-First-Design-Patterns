package com.ziaber.headfirst.designpatterns.decorator.starbuzz.condiments;

import com.ziaber.headfirst.designpatterns.decorator.starbuzz.beverages.Beverage;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }
}
