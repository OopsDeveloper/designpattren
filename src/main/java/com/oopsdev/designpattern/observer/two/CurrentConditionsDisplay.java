package com.oopsdev.designpattern.observer.two;

public class CurrentConditionsDisplay implements WeatherObserver{
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Current: " + temp + "F, " + humidity + "% humidity");
    }
}
