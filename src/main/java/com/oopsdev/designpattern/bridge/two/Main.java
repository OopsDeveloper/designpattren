package com.oopsdev.designpattern.bridge.two;

public class Main {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SMSSender();

        Message textMessage = new TextMessage(emailSender);
        textMessage.send("Hello World!");

        Message encryptedMessage = new EncryptedMessage(smsSender);
        encryptedMessage.send("Hello World!");

        Message encryptedMessage2 = new EncryptedMessage(emailSender);
        encryptedMessage2.send("Hello World!");
    }
}
