package com.oopsdev.designpattern.abstartfactory.two;

public class MySQLResultSet implements ResultSet{
    @Override
    public void getResults() {
        System.out.println("Getting results from MySQL database");
    }
}
