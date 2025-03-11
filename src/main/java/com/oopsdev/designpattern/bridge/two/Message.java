package com.oopsdev.designpattern.bridge.two;

// 추상화 부분
abstract class Message {
    protected MessageSender messageSender;

    // Bridge 패턴
    protected Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void send(String message);
}
