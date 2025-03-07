package com.oopsdev.designpattern.abstartfactory.two;

public class MySQLFactory implements DatabaseFactory{
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public Command createCommand() {
        return new MySQLCommand();
    }

    @Override
    public ResultSet createResultSet() {
        return new MySQLResultSet();
    }
}
