package com.javatravel;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.UUID;

public class JavaSQL {

    public static void writeToDatabase(String userName, String userPassword, String user_type) {

        String url = "jdbc:postgresql://localhost:5432/javafx";
        String user = "postgres";
        String password = "travel";

        String name = userName;
        String pass = userPassword;
        String type = user_type;

        // query
        String query = "INSERT INTO users(user_id,username,password,user_type) VALUES(?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(query)) {
             pst.setObject(1,UUID.randomUUID());
             pst.setString(2, name);
             pst.setString(3, pass);
             pst.setString(4, type);
             pst.executeUpdate();
             System.out.println("Sucessfully created.");

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(JavaSQL.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

    }

    public static boolean readUsers(String userName, String userPassword) {

        String url = "jdbc:postgresql://localhost:5432/javafx";
        String user = "postgres";
        String password = "travel";

        String name = userName;
        String pass = userPassword;

        // query
        String query = "SELECT username, password FROM users";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(query)) {
            ResultSet results = pst.executeQuery();
            while(results.next()) {
                if (userName.equals(results.getString("username")) && userPassword.equals(results.getString("password"))){
                    return true;
                }
            }
        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(JavaSQL.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return false;
    }

    public static void addPlaceToDataBase(String town, String adress, int nrbeds, double price) {

        String url = "jdbc:postgresql://localhost:5432/javafx";
        String user = "postgres";
        String password = "travel";

        // query
        String query = "INSERT INTO places(town,adress,nrbeds,price) VALUES(?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, town);
            pst.setString(2, adress);
            pst.setInt(3, nrbeds);
            pst.setDouble(4, price);
            pst.executeUpdate();
            System.out.println("Locatie adaugata");

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(JavaSQL.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

    }
}
