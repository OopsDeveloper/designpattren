package com.oopsdev.designpattern.bridge.one;

abstract class Remote {
    protected Device device;

    //추상화 부분(Remote)와 구현 부분(Device)의 다리로 작용하는 것(Bridge 패턴 핵심)
    protected Remote(Device device) {
        this.device = device;
    }

    public abstract void power();

    public void volumeUp() {
        device.setVolume(device.isEnabled() ? 1 : 0);
    }

    public void volumeDown() {
        device.setVolume(device.isEnabled() ? -1 : 0);
    }
}
