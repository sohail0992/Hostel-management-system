/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sohail
 */

class databaseConectivity{
    
       public ResultSet SelectQuery(String query,Connection con) throws SQLException{
          java.sql.Statement st = con.createStatement();
        st = con.createStatement();
        ResultSet x = st.executeQuery(query);
    
    return x;
    }
      
    public ResultSet updateQuery(String query,Connection con) throws SQLException{
          java.sql.Statement st = con.createStatement();
        st = con.createStatement();
        ResultSet x = st.executeQuery(query);
    
    return x;
    }
    
    public void getConnection() throws ClassNotFoundException, SQLException{
        
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        String connection_string = "jdbc:mysql://localhost:3306/acp";
        String user = "root";
        String pass = "";
        
         con = (Connection) DriverManager.getConnection(connection_string,user,pass);
        
    }
}
public class Student extends JFrame{
    
    public Student()
    {
                initUI();
    }
    
    private void initUI()
    {
    
      setVisible(true);
      
      setBounds(0, 0, 1000, 800);
      
      setName("mainFrame");
      
      setTitle("Great Student Hostel");
     
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      
     JPanel Registration = new JPanel();
     
     add(Registration);
     
     Registration.setLayout(null);
     
     JLabel nameLabel = new JLabel();
     nameLabel.setBounds(200, 50, 100, 100);
     nameLabel.setText("Name");
     
     JTextField nameField = new JTextField();
      nameField.setBounds(300, 85, 200, 30);
      
      
     JLabel f_nameLabel = new JLabel();
     f_nameLabel.setText("Father Name");
     f_nameLabel.setBounds(200, 100, 100, 100);
     JTextField f_nameField= new JTextField();
     f_nameField.setBounds(300, 135, 200, 30);
     
     
     JLabel cnicLabel = new JLabel();
     cnicLabel.setText("CNIC No");
      cnicLabel.setBounds(200, 150, 100, 100);
     JTextField cnicField = new JTextField();
      cnicField.setBounds(300, 185, 200, 30);
      
     JLabel dobLabel = new JLabel();
      dobLabel.setBounds(200, 200, 100, 100);
     dobLabel.setText("Date of Birth");
     JTextField dobField = new JTextField();
     dobField.setBounds(300, 235, 200, 30);
     
     
     JLabel prevEducationLabel = new JLabel();
      prevEducationLabel.setBounds(200, 250, 100, 100);
     prevEducationLabel.setText("Education Level");
     JTextField prevEducationField = new JTextField();
      prevEducationField.setBounds(300, 285, 200, 30);
      
      
     JLabel prevCollegeLabel = new JLabel();
     prevCollegeLabel.setBounds(200, 300, 100, 100);
     prevCollegeLabel.setText("College Name");
     JTextField prevCollegeField = new JTextField();
     prevCollegeField.setBounds(300, 335, 200, 30);
     
     
     JLabel prevMarksLabel = new JLabel();
     prevMarksLabel.setBounds(200, 350, 100, 100);
     prevMarksLabel.setText("Marks");
     JTextField prevMarksField = new JTextField();
     prevMarksField.setBounds(300, 385, 200, 30);
     
     Registration.add(nameField);
     
     Registration.add(nameLabel);
     
     Registration.add(f_nameLabel);
     
     Registration.add(f_nameField);
     
     Registration.add(dobLabel);
     
     Registration.add(dobField);
     
     Registration.add(cnicLabel);
     
     Registration.add(cnicField);
     
     Registration.add(prevEducationLabel);
     
     Registration.add(prevEducationField);
     
     Registration.add(prevCollegeLabel);
     
     Registration.add(prevCollegeField);
     
     Registration.add(prevMarksLabel);
     
     Registration.add(prevMarksField);
     
     
    }
    
    
}
