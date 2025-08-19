package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tabela";
        String user = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, user, password);
<<<<<<< HEAD
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT 'Olá SQL' AS msg")) {
=======
             Statement stmt = conn.createStatement()) {
>>>>>>> 38b51dadea5db35dc866dd369789b00518ed3735

            try (ResultSet rs = stmt.executeQuery("SELECT 'Oi SQL' AS msg")) {
                while (rs.next()) {
                    System.out.println(rs.getString("msg"));
                }
            }

            System.out.println("\nListando tabelas no schema 'tabela':");
            try (ResultSet rsTables = stmt.executeQuery("SHOW TABLES")) {
                while (rsTables.next()) {
                    System.out.println(" - " + rsTables.getString(1));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}