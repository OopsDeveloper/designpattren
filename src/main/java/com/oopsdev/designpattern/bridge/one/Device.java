package com.oopsdev.designpattern.bridge.one;

public interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
    boolean isEnabled();
}
