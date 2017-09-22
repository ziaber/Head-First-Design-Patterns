package com.ziaber.headfirst.desingpatterns.ducks.behaviors;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
