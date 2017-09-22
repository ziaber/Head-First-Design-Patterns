package com.ziaber.headfirst.desingpatterns.ducks;

import com.ziaber.headfirst.desingpatterns.ducks.behaviors.FlyBehavior;
import com.ziaber.headfirst.desingpatterns.ducks.behaviors.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly(){
        this.flyBehavior.fly();
    }

    public void performQuack(){
        this.quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
