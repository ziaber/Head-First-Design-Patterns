package com.ziaber.headfirst.designpatterns.observer.simple;

/**
 * Created by Marcin Ziaber on 2017-09-23.
 */
public interface Subject {
    void registerObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void notifyObservers();
}
