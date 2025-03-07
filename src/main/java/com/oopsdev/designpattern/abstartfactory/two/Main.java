package com.oopsdev.designpattern.abstartfactory.two;

public class Main {
    public static void main(String[] args) {
        DatabaseClient mysqlClient = new DatabaseClient(new MySQLFactory());
        mysqlClient.performDatabaseOpertaions();

        System.out.println("\nSwitching to PostgreSQL...\n");

        DatabaseClient postgresClient = new DatabaseClient(new PostgreSQLFactory());
        postgresClient.performDatabaseOpertaions();
    }
}
