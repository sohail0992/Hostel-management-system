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
    
    private int numberOfColoms;
    
    private  int numberOfRows;
    
    private boolean connectedToDatabase = false;
    
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/hostelmanagementsystem";
      
    private final String user = "root";
    
    private final String pass = "";
    
    public int Update_Query(String query) throws SQLException, ClassNotFoundException
    {
       
        Connection connection = getConnection();
     
        statement =   (Statement) connection.createStatement();
        
        statement.executeUpdate(query);
        
        numberOfRows = statement.getMaxRows();
       
        return numberOfRows;
    }
    
    
    
    public ResultSet Select_Query(String query) throws SQLException, ClassNotFoundException
    {
        
        
        Connection connection = getConnection();
       
        if(!connectedToDatabase)
        {
        throw new IllegalStateException ("Not Connected To Database");
        }
      
        statement =  (Statement) connection.createStatement();
          
        statement.executeQuery(query);
         
        resultSet = statement.getResultSet();
        
        return resultSet;
    }
    
    public Connection getConnection() 
    {
        try
        {
           
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Connection con = DriverManager.getConnection(DATABASE_URL, user, pass);
            
               connectedToDatabase = true;
            
            return con;
        
        }
        catch(SQLException e )
        {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, e);
         
        }
            
       
            
         return null;
    }
    
    public void displayAll(String query)
    {
          Connection connection = getConnection();
          
           statement = null;
           
           resultSet = null;
           
           resultSetMetaData = null;
           
           numberOfColoms = 0;
           
        try {
            
            statement = connection.createStatement();
            
            resultSet = statement.executeQuery(query);
          
            //obtain the infromation about the column name type and coloumn count
            
            resultSetMetaData = resultSet.getMetaData();
            
            numberOfColoms = resultSetMetaData.getColumnCount();
            
            numberOfRows = resultSet.getRow();
            
            for(int i = 1; i<= numberOfColoms;i++)
            {
            System.out.printf("%s\t",resultSetMetaData.getColumnName(i));
            
            while(resultSet.next())
            {
                for(int j = 1; j<= numberOfColoms;j++)
                {
                  System.out.printf("%s\t",resultSet.getObject(i));
                }
            
            }
            
            }
            
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
        } 
        
        finally
        {
            connectedToDatabase = false;        
        }
    }
        
    }
    
    
    
 
}
