package org.example.dsa2026.jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatements {
    public static void menu(){
        System.out.println("************** STUDENT MANAGEMENT SYSTEM ***************");
        System.out.println("1. INSERT DATA");
        System.out.println("2. UPDATE DATA");
        System.out.println("3. DELETE DATA");
        System.out.println("4. RETRIEVE DATA");
        System.out.println("5. EXIT");
    }
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/devops_db";
        String username = "postgres";
        String password = "root5113";

        Scanner scanner = new Scanner(System.in);
        int choice;
     do {
         menu();
         System.out.print("Enter Your Choice : ");
         choice = scanner.nextInt();
         scanner.nextLine();
         switch (choice) {
             case 1:
                 insert(url, username, password);
                 break;
             case 2:
                 update(url, username, password);
                 break;
             case 3:
                 delete(url, username, password);
                 break;
             case 4:
                 retrieve(url, username, password);
                 break;
             case 5:
                 System.out.print("EXITING SYSTEM");
                 try{
                     for(int i=0; i<5; i++) {
                         Thread.sleep(1000);
                         System.out.print(" .");
                     }
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
                 System.out.println("\nTHANK YOU !!!");
                 break;
             default:
                 System.out.println("INVALID CHOICE !!! PLEASE ENTER VALID CHOICE");
         }

     }while (choice != 5);

    }
    public static void insert(String url, String username, String password){
        String query = "INSERT INTO student(id, name, college, location) VALUES (?, ?, ?, ?);";

        try{
            Scanner scanner = new Scanner(System.in);

            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            System.out.print("Enter the ID : ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter the Name : ");
            String name = scanner.nextLine();
            System.out.print("Enter the College : ");
            String college = scanner.nextLine();
            System.out.print("Enter the Location : ");
            String location = scanner.nextLine();

             preparedStatement.setInt(1,id);
             preparedStatement.setString(2, name);
             preparedStatement.setString(3, college);
            preparedStatement.setString(4, location);

            int rowsAffected = preparedStatement.executeUpdate();
            if(rowsAffected > 0){
                System.out.println("***********************************");
                System.out.println("INSERT SUCCESFULL " + rowsAffected + " Row's Affected");
            } else {
                System.out.println("***********************************");
                System.out.println("INSERTION FAILED");
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void update(String url, String username, String password){
        String query = "UPDATE student SET name = ? , college = ? , location = ? WHERE id = ? ";
        try{
            Scanner scanner = new Scanner(System.in);
            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            System.out.print("Enter the Name : ");
           String name = scanner.nextLine();
            System.out.print("Enter the College : ");
           String college = scanner.nextLine();
            System.out.print("Enter the Location : ");
           String location = scanner.nextLine();
           int id = scanner.nextInt();
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, college);
            preparedStatement.setString(3, location);
            preparedStatement.setInt(4,id);

            int rowsAffected = preparedStatement.executeUpdate();
            if(rowsAffected > 0){
                System.out.println("***********************************");
                System.out.println("UPADTE SUCCESSFULL " + rowsAffected + " Row's Affected");
            }else {
                System.out.println("***********************************");
                System.out.println("UPDATION FAILED");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void delete(String url, String username, String password){
        String query = "DELETE FROM student WHERE id = ?";
        try{
            Scanner scanner = new Scanner(System.in);
            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            System.out.print("Enter ID to Remove Data : ");
            int id = scanner.nextInt();
            preparedStatement.setInt(1,id);
            int rowsAffected = preparedStatement.executeUpdate();
            if(rowsAffected > 0){
                System.out.println("***********************************");
                System.out.println("DELETE SUCCESSFULL " + rowsAffected + " Row's Affected");
            }else {
                System.out.println("***********************************");
                System.out.println("DELETION FAILED");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void retrieve(String url, String username, String password){
        String query = "SELECT * FROM student;";
        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println("-----------------------------------");
                System.out.println("ID : " + resultSet.getInt("id"));
                System.out.println("NAME : " + resultSet.getString("name"));
                System.out.println("COLLEGE : " + resultSet.getString("college"));
                System.out.println("LOCATION : " + resultSet.getString("location"));
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
