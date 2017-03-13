/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Spring;
import javax.swing.SpringLayout;

/**
 *
 * @author Sohail
 */
public class Student extends JFrame{
    
    public Student()
    {
        try{
            initUI();
        }catch(ClassNotFoundException | SQLException e){
        
        }
    }
    
    private void initUI() throws SQLException, ClassNotFoundException
    {
        
    
      setVisible(true);
  
      setBounds(0, 0, 900, 700);
      
      setName("mainFrame");
      
      setTitle("Great Student Hostel");
     
      setDefaultCloseOperation(EXIT_ON_CLOSE);
     
     JPanel Registration = new JPanel();
     
     SpringLayout layout = new SpringLayout();
      
     Registration.setLayout(layout);
 
     add(Registration);
     
     JLabel nameLabel = new JLabel();
     
     nameLabel.setText("Name");
     
     JTextField nameField = new JTextField();
     
     nameField.setPreferredSize(new Dimension(90,20));
     
     JLabel f_nameLabel = new JLabel();
     
     f_nameLabel.setText("Father Name");
  
      
     
     JTextField f_nameField= new JTextField();
     
     JLabel cnicLabel = new JLabel();
     
     cnicLabel.setText("CNIC No");
     
     JTextField cnicField = new JTextField();
     
     JLabel dobLabel = new JLabel();
     
     dobLabel.setText("Date of Birth");
     
     JTextField dobField = new JTextField();
     
     JLabel prevEducationLabel = new JLabel();
     
     prevEducationLabel.setText("Education Level");
    
     JTextField prevEducationField = new JTextField();
     
     JLabel prevCollegeLabel = new JLabel();
     
     prevCollegeLabel.setText("College Name");
    
     JTextField prevCollegeField = new JTextField();
     
     JLabel prevMarksLabel = new JLabel();
     
     prevMarksLabel.setText("Marks");
     
     JTextField prevMarksField = new JTextField();
     
     
     Registration.add(nameLabel);
     
     Registration.add(nameField);
     
     Registration.add(f_nameLabel);
     
     Registration.add(f_nameField);
     
     
     database.DataBase connectivity = new database.DataBase();
     
     Connection con ;
     
     
      con = connectivity.getConnection();
     
       
     
    
   
     
     String sql = "INSERT INTO students (name, cms, cnic) VALUES ('Sohail','14465','17201') ";
     
     connectivity.Update_Query(sql);
   
     
     
    }
    
    
}
