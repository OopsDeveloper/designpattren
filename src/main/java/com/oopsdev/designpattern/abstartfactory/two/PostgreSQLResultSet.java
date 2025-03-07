package com.oopsdev.designpattern.abstartfactory.two;

public class PostgreSQLResultSet implements ResultSet{
    @Override
    public void getResults() {
        System.out.println("Getting results from PostgreSQL database");
    }
}
