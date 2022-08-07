package com.example.Homework.repositories.Implementations.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    Connection co;
    public void connect() {
        try{
            co = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","7yearsfn");
            System.out.println("Connected to database");
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

    public Statement getStatement() throws SQLException {
        return co.createStatement();
    }
}
