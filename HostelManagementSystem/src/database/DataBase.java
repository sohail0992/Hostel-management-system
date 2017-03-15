/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sohail
 */
public class DataBase {
    
    private Connection connection;
    
    private Statement statement;
    
    private ResultSet resultSet;
    
    private ResultSetMetaData resultSetMetaData;
    
    private  int numberOfRows;
    
    private boolean connectedToDatabase = false;
    
    private final String DATABASE_URL = "dbc:mysql://localhost:3306/hostelmanagementsystem";
    
    private final String user = "root";
    
    private final String pass = "";
    
    public int Update_Query(String query,Connection con) throws SQLException, ClassNotFoundException
    {
     
        statement  =null;
    
        statement = con.createStatement();
        
        numberOfRows = statement.executeUpdate(query);
       
        return numberOfRows;
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
     Connection con = DriverManager.getConnection(DATABASE_URL, user, pass);
     connectedToDatabase = true;
     return con;
    }
    
    public void displayAll(String query,Connection connection)
    {
           statement = null;
           
           resultSet = null;
           
        try {
            
            statement = connection.createStatement();
            
            resultSet = statement.executeQuery(query);
            
            resultSetMetaData = resultSet.getMetaData();
            
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
      
     
    
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
