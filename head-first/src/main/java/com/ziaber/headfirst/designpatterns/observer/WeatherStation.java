package com.ziaber.headfirst.designpatterns.observer;

import com.ziaber.headfirst.designpatterns.observer.DisplayElement;
import com.ziaber.headfirst.designpatterns.observer.WeatherData;
import com.ziaber.headfirst.designpatterns.observer.displays.CurrentConditionsDisplay;
import com.ziaber.headfirst.designpatterns.observer.displays.HeatIndexDisplay;

/**
 * Created by Marcin Ziaber on 2017-09-23.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        DisplayElement currentConditionsElement = new CurrentConditionsDisplay(weatherData);
        DisplayElement heatIndexElement = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
