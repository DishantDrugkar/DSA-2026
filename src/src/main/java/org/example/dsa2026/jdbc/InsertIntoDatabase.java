package org.example.dsa2026.jdbc;

import java.sql.*;

public class InsertIntoDatabase {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/devops_db";
        String username = "postgres";
        String password = "root5113";
        String query = "INSERT INTO student(id, name, college, location) VALUES (2,'Dishant', 'PJLCOE', 'Nagpur'); ";
        Connection connection = DriverManager.getConnection(url,username,password);
        Statement stmt = connection.createStatement();
        int rowsAffected = stmt.executeUpdate(query);
        if(rowsAffected > 0){
            System.out.println("Insert Successfull " + rowsAffected + " Row's Affected");
        } else{
            System.out.println("INSERTION FAILED");
        }

        stmt.close();
        connection.close();
    }
}
