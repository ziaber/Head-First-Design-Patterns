package com.ziaber.headfirst.designpatterns.decorator.starbuzz.condiments;

import com.ziaber.headfirst.designpatterns.decorator.starbuzz.beverages.Beverage;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + .10;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " Whip";
    }
}
