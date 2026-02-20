package org.example.dsa2026.jdbc;

import java.sql.*;

public class DeleteIntoDatabase {
    public static void main(String[] args) {
       String  url = "jdbc:postgresql://localhost:5432/devops_db";
       String userName = "postgres";
       String password = "root5113";

        retrieve(url,userName,password);
        insert(url,userName,password);
        retrieve(url,userName,password);

        update(url,userName,password);
        retrieve(url,userName,password);

        delete(url,userName,password);
        retrieve(url,userName,password);

    }
    public static void delete(String url, String userName, String Password){

         String query = "DELETE FROM student WHERE id = 3;";
         try{
             Connection connection = DriverManager.getConnection(url,userName,Password);
             System.out.println("Connection Established");
             Statement statement = connection.createStatement();
             int rowsAffected = statement.executeUpdate(query);

             if(rowsAffected > 0){
                 System.out.println("DELETION SUCCESSFULL " + rowsAffected + " row's Affected");
             } else {
                 System.out.println("DELETION FAILED");
             }

         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
    }

    public static void insert(String url, String username, String password){
        String query = "INSERT INTO student(id, name, college, location) VALUES (3, 'Ankit', 'Ramdeobaba', 'Tokyo');";

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(query);

            if(rowsAffected > 0){
                System.out.println("INSERT SUCCESSFULL " + rowsAffected + " Row's Affected");
            } else {
                System.out.println("INSERTION FALIED");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void update(String url, String usernama, String password){
        String query = "UPDATE student " +
                       "SET college = 'IIM Kashipur', location = 'Remote' " +
                       "WHERE id = 3;" ;

        try{
            Connection connection = DriverManager.getConnection(url, usernama, password);
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(query);

            if(rowsAffected > 0){
                System.out.println("UPDATE SUCCESSFULL " + rowsAffected + " row's Affected");
            } else{
                System.out.println("UPDATION FAILED");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void retrieve(String url, String username, String password){
        String query = "SELECT * FROM student;";

        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String college = resultSet.getString("college");
                String location = resultSet.getString("location");
                System.out.println("--------------------------------------------------");
                System.out.println("ID : " + id);
                System.out.println("NAME : " + name);
                System.out.println("COLLEGE : " + college);
                System.out.println("LOCATION : " + location);
            }
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
