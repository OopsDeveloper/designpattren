package com.oopsdev.designpattern.bridge.two;

abstract class Message {
    protected MessageSender messageSender;

    protected Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void send(String message);
}
