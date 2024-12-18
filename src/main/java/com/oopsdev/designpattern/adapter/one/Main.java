package com.oopsdev.designpattern.adapter.one;

public class Main {
    public static void main(String[] args) {
        OldMessageSender oldsSystem = new OldMessageSystem();
        ModernMessageSender adapter = new MessageAdapter(oldsSystem);

        adapter.sendMessage("Hello, World!", "chiro@example.com");
    }
}
