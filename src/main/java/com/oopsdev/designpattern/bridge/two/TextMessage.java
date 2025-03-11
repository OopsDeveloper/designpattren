package com.oopsdev.designpattern.bridge.two;

// 추상화 부분
class TextMessage extends Message {
    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }
    @Override
    public void send(String message) {
        messageSender.sendMessage("Text Message: " + message);
    }
}
