package com.ziaber.headfirst.designpatterns.observer.java_based.displays;

import com.ziaber.headfirst.designpatterns.observer.java_based.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Marcin Ziaber on 2017-09-23.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + " F degrees and " + humidity + " humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.humidity = weatherData.getHumidity();
            this.temperature = weatherData.getTemperature();
        }
        display();
    }
}
