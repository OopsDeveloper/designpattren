package com.oopsdev.designpattern.singleton.add;

public class Label {
    private String text;

    public Label(String text) {
        this.text = text;
    }

    public void display() {
        String themeColor = Theme.getInstance().getThemeColor();
        System.out.println(
                "Label [" + text + "] displayed in " + themeColor + " theme."
        );
    }
}
