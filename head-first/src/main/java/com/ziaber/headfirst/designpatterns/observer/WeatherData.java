package com.ziaber.headfirst.designpatterns.observer;

import java.util.ArrayList;

/**
 * Created by Marcin Ziaber on 2017-09-23.
 */
public class WeatherData implements Subject {
    private ArrayList<WeatherObserver> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    @Override
    public void registerObserver(WeatherObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observer -> observer.update(this.temperature, this.humidity, this.pressure));
    }
}
