package com.oopsdev.designpattern.abstartfactory.one;

public class Main {
    public static void main(String[] args) {
        GUIFactory windowFactory = new WindowFactory();
        Application windowApp = new Application(windowFactory);
        windowApp.paint();

        System.out.println();

        GUIFactory macFactory = new MacOSFactory();
        Application macApp = new Application(macFactory);
        macApp.paint();

//        GUIFactory factory;
//        String os = "Windows";
//        if (os.equalsIgnoreCase("Windows")) {
//            factory = new WindowsFactory();
//        } else {
//            factory = new MacFactory();
//        }
//        Application app = new Application(factory);
//        app.paint();

    }
}
