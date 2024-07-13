package kidsland;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysqlc {
    public static Connection mycon() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kidsland2", "root","");
            System.out.println("Connection established successfully");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Database Driver not found");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to establish connection");
        }
        return conn;
    }
}
