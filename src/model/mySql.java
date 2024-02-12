package model;

 

 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

 

import java.sql.Statement;

 

public class mySql {
  private static Connection c;
   private static final String username="root";
   private static final String password="Lochana5712@";
   private static final String database="assignment02";

    public static Statement createConnection() throws Exception {

 

        if (c == null) {

 

            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database, username, password);
        }

 

        Statement s = c.createStatement();
        return s;

 

    }

 

    public static void iud(String query) {

 

        try {

 

            createConnection().executeUpdate(query);

 

        } catch (Exception e) {
            System.out.println(e);
        }

 

    }

 

    public static ResultSet search(String query) throws Exception {

 

        ResultSet r = createConnection().executeQuery(query);

 

        return r;

 

    }

 

    public static ResultSet execute(String select__from_product_INNER_JOIN_brand_ON_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

    public static void uid(String select__from_user_INNER_JOIN_country_ON_u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




 

}