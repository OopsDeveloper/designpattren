package com.oopsdev.designpattern.abstartfactory.two;

public class PostgreSQLCommand implements Command{
    @Override
    public void execute(String query) {
        System.out.println("Executing PostgreSQL query: " + query);
    }
}
