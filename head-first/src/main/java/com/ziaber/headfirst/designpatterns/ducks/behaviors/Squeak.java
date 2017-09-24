package com.ziaber.headfirst.designpatterns.ducks.behaviors;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
