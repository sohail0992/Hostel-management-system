/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Abdul Waheed
 */
public class HostelManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       mainScreen msObj = new mainScreen();
       databaseConectivity c = new databaseConectivity();
      c.getConnection();
      
      //String sql = "in"
      msObj.setVisible(true);
       
      }
    
}
