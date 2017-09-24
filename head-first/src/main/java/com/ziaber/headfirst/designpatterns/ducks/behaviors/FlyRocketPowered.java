package com.ziaber.headfirst.designpatterns.ducks.behaviors;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with rocket!");
    }
}
