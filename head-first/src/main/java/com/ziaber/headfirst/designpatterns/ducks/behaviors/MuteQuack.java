package com.ziaber.headfirst.designpatterns.ducks.behaviors;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
