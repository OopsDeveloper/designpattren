package com.oopsdev.designpattern.abstartfactory.two;

public class PostgreSQLFactory implements DatabaseFactory{
    @Override
    public Connection createConnection() {
        return new PostgreSQLConnection();
    }

    @Override
    public Command createCommand() {
        return new PostgreSQLCommand();
    }

    @Override
    public ResultSet createResultSet() {
        return new PostgreSQLResultSet();
    }
}
