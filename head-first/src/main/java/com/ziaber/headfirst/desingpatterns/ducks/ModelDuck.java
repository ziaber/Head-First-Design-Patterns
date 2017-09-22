package com.ziaber.headfirst.desingpatterns.ducks;

import com.ziaber.headfirst.desingpatterns.ducks.behaviors.FlyNoWay;
import com.ziaber.headfirst.desingpatterns.ducks.behaviors.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
