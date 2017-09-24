package com.ziaber.headfirst.designpatterns.observer.simple.displays;

import com.ziaber.headfirst.designpatterns.observer.simple.Subject;
import com.ziaber.headfirst.designpatterns.observer.simple.WeatherObserver;

/**
 * Created by Marcin Ziaber on 2017-09-23.
 */
public class HeatIndexDisplay implements WeatherObserver, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + this.computeHeatIndex(this.temperature, this.humidity));
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temp;
        this.display();
    }

    private float computeHeatIndex(float temp, float humidity) {
        return (float) ((16.923 + (0.185212 * temp) + (5.37941 * humidity) - (0.100254 * temp * humidity) +
                (0.00941695 * (temp * temp)) + (0.00728898 * (humidity * humidity)) +
                (0.000345372 * (temp * temp * humidity)) - (0.000814971 * (temp * humidity * humidity)) +
                (0.0000102102 * (temp * temp * humidity * humidity)) - (0.000038646 * (temp * temp * temp)) + (0.0000291583 *
                (humidity * humidity * humidity)) + (0.00000142721 * (temp * temp * temp * humidity)) +
                (0.000000197483 * (temp * humidity * humidity * humidity)) - (0.0000000218429 * (temp * temp * temp * humidity * humidity)) +
                0.000000000843296 * (temp * temp * humidity * humidity * humidity)) -
                (0.0000000000481975 * (temp * temp * temp * humidity * humidity * humidity)));
    }
}
