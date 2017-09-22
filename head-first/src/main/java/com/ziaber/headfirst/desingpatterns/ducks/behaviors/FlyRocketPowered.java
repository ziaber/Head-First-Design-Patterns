package com.ziaber.headfirst.desingpatterns.ducks.behaviors;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with rocket!");
    }
}
