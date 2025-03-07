package com.oopsdev.designpattern.abstartfactory.two;

public class MySQLCommand implements Command{
    @Override
    public void execute(String query) {
        System.out.println("Executing MySQL query: " + query);
    }
}
