package com.ziaber.headfirst.designpatterns.observer.simple;

/**
 * Created by Marcin Ziaber on 2017-09-23.
 */
public interface WeatherObserver {
    void update(float temp, float humidity, float pressure);
}
