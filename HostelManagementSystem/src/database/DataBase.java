/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sohail
 */
public class DataBase {
    
    public int Update_Query(String query) throws SQLException, ClassNotFoundException
    {
        
        
        Connection con = this.getConnection();
     
        Statement st =null;
        
        int x = -1;
        
        st = con.createStatement();
        
        x = st.executeUpdate(query);
       
        return x;
    }
    
    
    
     public int Select_Query(String query) throws SQLException, ClassNotFoundException
    {
       
        
        Statement st = null;
        
        ResultSet rs = null;
        
     //   st = con.createStatement();
        
        rs = st.executeQuery(query);
        
        return 0;
        

    }
    
    public Connection getConnection() throws ClassNotFoundException, SQLException
    {
    // Connection con = null;
     Class.forName("com.mysql.jdbc.Driver");
     String connection_string = "jdbc:mysql://localhost:3306/hostelmanagementsystem";
     String user = "root";
     String pass = "";
     Connection con = DriverManager.getConnection(connection_string, user, pass);
    
   
        return con;
    }
    
    
}
