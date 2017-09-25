package com.ziaber.headfirst.designpatterns.decorator.starbuzz.beverages;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double getCost() {
        return 0.89;
    }
}
