package com.ziaber.headfirst.desingpatterns.ducks.behaviors;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
