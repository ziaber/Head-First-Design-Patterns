package com.ziaber.headfirst.desingpatterns.ducks.behaviors;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
