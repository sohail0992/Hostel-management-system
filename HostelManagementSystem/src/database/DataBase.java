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
    
    private Connection connection;
    
    private Statement statement;
    
    private ResultSet resultSet;
    
    private  int numberOfRows;
    
    private boolean connectedToDatabase = false;
    
    public int Update_Query(String query) throws SQLException, ClassNotFoundException
    {
        
        
        Connection con = this.getConnection();
     
        Statement st =null;
        
        int x = -1;
        
        st = con.createStatement();
        
        x = st.executeUpdate(query);
       
        return x;
    }
    
    
    
    public void Select_Query(String query) throws SQLException, ClassNotFoundException
    {
       
        if(!connectedToDatabase)
        {
        throw new IllegalStateException ("Not Connected To Database");
        }
      
        statement = null;
        
        resultSet = null;
        
        resultSet = statement.executeQuery(query);
        
    }
    
    public Connection getConnection() throws ClassNotFoundException, SQLException
    {
    // Connection con = null;
     Class.forName("com.mysql.jdbc.Driver");
     String connection_string = "jdbc:mysql://localhost:3306/hostelmanagementsystem";
     String user = "root";
     String pass = "";
     Connection con = DriverManager.getConnection(connection_string, user, pass);
     connectedToDatabase = true;
     return con;
    }
    
    public void disconnectFromDatabase()
    {
    if(connectedToDatabase)
    {
     
        try
        {
               resultSet.close();
               statement.close();
               connection.close();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        } 
        
        finally
        {
            connectedToDatabase = false;        
        }
    }
        
    }
}
