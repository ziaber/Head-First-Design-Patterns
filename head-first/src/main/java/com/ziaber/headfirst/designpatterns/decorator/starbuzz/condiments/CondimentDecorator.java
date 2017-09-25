package com.ziaber.headfirst.designpatterns.decorator.starbuzz.condiments;

import com.ziaber.headfirst.designpatterns.decorator.starbuzz.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
