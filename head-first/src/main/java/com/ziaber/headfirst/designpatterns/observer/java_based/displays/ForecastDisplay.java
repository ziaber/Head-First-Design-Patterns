package com.ziaber.headfirst.designpatterns.observer.java_based.displays;

import com.ziaber.headfirst.designpatterns.observer.java_based.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Marcin Ziaber on 2017-09-24.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.lastPressure = this.currentPressure;
            this.currentPressure = weatherData.getPressure();
        }
        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
