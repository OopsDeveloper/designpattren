package com.oopsdev.study.designpattern.adapter;

public class PrintBannerExtents extends Banner implements PrintInterface{
    public PrintBannerExtents(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
