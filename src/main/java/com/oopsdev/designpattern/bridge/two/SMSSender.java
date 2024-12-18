package com.oopsdev.designpattern.bridge.two;

class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}
