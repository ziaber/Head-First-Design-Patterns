package com.ziaber.headfirst.designpatterns.observer.java_based;

import java.util.Observable;

/**
 * Created by Marcin Ziaber on 2017-09-23.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    private void measurementChanged() {
        this.setChanged();
        this.notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
