package com.oopsdev.designpattern.abstartfactory.two;

public class DatabaseClient {
    private Connection connection;
    private Command command;
    private ResultSet resultSet;

    public DatabaseClient(DatabaseFactory factory) {
        this.connection = factory.createConnection();
        this.command = factory.createCommand();
        this.resultSet = factory.createResultSet();
    }

    public void performDatabaseOpertaions() {
        connection.open();
        command.execute("SELECT * FROM users");
        resultSet.getResults();
        connection.close();
    }
}
