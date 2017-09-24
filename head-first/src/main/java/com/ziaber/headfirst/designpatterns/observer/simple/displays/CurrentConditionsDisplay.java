package com.ziaber.headfirst.designpatterns.observer.simple.displays;

import com.ziaber.headfirst.designpatterns.observer.simple.Subject;
import com.ziaber.headfirst.designpatterns.observer.simple.WeatherObserver;

/**
 * Created by Marcin Ziaber on 2017-09-23.
 */
public class CurrentConditionsDisplay implements WeatherObserver, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + " F degrees and " + humidity + " humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
