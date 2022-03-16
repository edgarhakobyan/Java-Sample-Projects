package com.edgar.jdbcdemo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public ConnectionFactory() { }

    public static ConnectionFactory getInstance() {
        return Helper.FACTORY;
    }

    public Connection openConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "", "");
    }

    private static class Helper {
        private static final ConnectionFactory FACTORY = new ConnectionFactory();
    }
}
