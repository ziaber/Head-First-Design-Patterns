package com.ziaber.headfirst.designpatterns.singleton;

public enum EnumBasedSingleton {
    INSTANCE;

    public void whoAmI(){
        System.out.println("I am a singleton!");
    }
}
