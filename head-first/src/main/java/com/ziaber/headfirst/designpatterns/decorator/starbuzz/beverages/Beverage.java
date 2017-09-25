package com.ziaber.headfirst.designpatterns.decorator.starbuzz.beverages;

public abstract class Beverage {
    String description = "Unknown beverage";

    public abstract double getCost();

    public String getDescription() {
        return description;
    }
}
