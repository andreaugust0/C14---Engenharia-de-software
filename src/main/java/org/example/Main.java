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
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT 'Oi SQL' AS msg")) {

            while (rs.next()) {
                System.out.println(rs.getString("msg"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
