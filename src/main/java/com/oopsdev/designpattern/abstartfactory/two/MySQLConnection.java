package com.oopsdev.designpattern.abstartfactory.two;

public class MySQLConnection implements Connection{
    @Override
    public void open() {
        System.out.println("Opening MySQL connection");
    }

    @Override
    public void close() {
        System.out.println("Closing MySQL connection");
    }
}
