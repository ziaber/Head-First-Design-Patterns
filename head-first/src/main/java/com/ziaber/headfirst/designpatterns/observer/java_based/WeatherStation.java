package com.ziaber.headfirst.designpatterns.observer.java_based;

import com.ziaber.headfirst.designpatterns.observer.java_based.displays.CurrentConditionsDisplay;
import com.ziaber.headfirst.designpatterns.observer.java_based.displays.DisplayElement;
import com.ziaber.headfirst.designpatterns.observer.java_based.displays.ForecastDisplay;

/**
 * Created by Marcin Ziaber on 2017-09-23.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        DisplayElement currentConditionsElement = new CurrentConditionsDisplay(weatherData);
        DisplayElement forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
