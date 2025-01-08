package com.oopsdev.study.designpattern.adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------상속을 사용 -------------");
        PrintInterface p = new PrintBannerExtents("Hello");
        p.printWeak();
        p.printStrong();

        System.out.println("-----------------------------------");
        System.out.println("------------위임을 사용 -------------");
        Print p2 = new PrintBanner(new Banner("Hi"));
        p2.printWeak();
        p2.printStrong();
    }
}
