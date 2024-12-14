package com.oopsdev.designpattern.observer.two;

public interface WeatherStation {
    void registerObserver(WeatherObserver o);
    void removeObserver(WeatherObserver o);
    void notifyObservers();
}
