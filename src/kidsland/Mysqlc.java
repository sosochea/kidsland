package kidsland;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysqlc {
    public static Connection mycon() {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Utilisation du nouveau driver
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kidsland", "root", "soso");
            System.out.println("Connection established");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
        
        return con;
    }
}


    /*
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conn = null;
      try {
          // db parameters - ptest is the name of the database
          String url       = "jdbc:mysql://localhost:3306/kidsland";
          String user      = "root";
          String password  = "soso";

          // create a connection to the database
          conn = DriverManager.getConnection(url, user, password);
          // more processing here
          // ...   
          Statement stmt=conn.createStatement(); 
      ResultSet rs=stmt.executeQuery("select * from customer"); 
      while(rs.next()) 
      System.out.println(rs.getInt(1)+"  "+rs.getString(2)); 
      conn.close(); 
      } catch(SQLException e) {
         System.out.println(e.getMessage());
      } finally {
          try{
                 if(conn != null)
                   conn.close();
          }catch(SQLException ex){
                 System.out.println(ex.getMessage());
          }
      }
    }*/
  