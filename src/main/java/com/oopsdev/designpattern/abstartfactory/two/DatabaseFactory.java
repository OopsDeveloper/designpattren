package com.oopsdev.designpattern.abstartfactory.two;

public interface DatabaseFactory {
    Connection createConnection();

    Command createCommand();

    ResultSet createResultSet();
}
