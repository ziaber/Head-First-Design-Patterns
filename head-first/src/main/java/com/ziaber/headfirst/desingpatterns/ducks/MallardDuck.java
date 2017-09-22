package com.ziaber.headfirst.desingpatterns.ducks;

import com.ziaber.headfirst.desingpatterns.ducks.behaviors.FlyWithWings;
import com.ziaber.headfirst.desingpatterns.ducks.behaviors.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real duck!");
    }
}
