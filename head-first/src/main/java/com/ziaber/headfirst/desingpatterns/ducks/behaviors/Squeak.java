package com.ziaber.headfirst.desingpatterns.ducks.behaviors;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
