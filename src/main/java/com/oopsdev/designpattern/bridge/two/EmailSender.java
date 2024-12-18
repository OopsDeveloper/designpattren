package com.oopsdev.designpattern.bridge.two;

class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
