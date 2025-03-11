package com.oopsdev.designpattern.bridge.two;

// 구현 부분
class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}
