package com.oopsdev.designpattern.singleton.add;

public class Theme {
    private static Theme instance;
    private String themeColor;

    private Theme() {
        this.themeColor = "light"; // Default theme
    }

    // Static Inner Class
    private static class ThemeHolder {
        private static final Theme INSTANCE = new Theme();
    }

    // 싱글톤 인스턴스를 반환하는 메서드
    public static Theme getInstance() {
        return ThemeHolder.INSTANCE;
    }

//    public static Theme getInstance() {
//        if (instance == null) {
//            instance = new Theme();
//        }
//        return instance;
//    }

    public String getThemeColor() {
        return themeColor;
    }
    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }
}
