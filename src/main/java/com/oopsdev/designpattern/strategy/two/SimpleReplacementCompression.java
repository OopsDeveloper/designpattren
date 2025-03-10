package com.oopsdev.designpattern.strategy.two;

class SimpleReplacementCompression implements CompressionStrategy {
    @Override
    public String compress(String data) {
        return data.replace("a", "1")
                .replace("e", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("u", "5");
    }
}
