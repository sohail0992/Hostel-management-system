/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sohail
 */
public class Login extends JFrame{
    
    
    public Login()
    {
     initUI();
    }
    
    private void initUI()
    {
     
        setBounds(0, 0, 900, 660);
        
        setName("Admin Login");
      
       setTitle("Great Student Hostel");
     
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        setResizable(false);
       
           
      JPanel loginFormButton = new JPanel();
        
      loginFormButton.setLayout(null);
          
      JLabel title = new JLabel();
      
       title .setBounds(250, 0, 500, 50);
      
      title .setText("Admin Login");
      
      title.setFont(title.getFont().deriveFont(25f));
      
      title.setForeground(Color.white);
   
        
      add(loginFormButton);
      
      JButton userName = new JButton("User Name");
      
      userName.setBounds(0, 0, 200, 70);
      
      userName.setFont(userName.getFont().deriveFont(18f));
      
     
       JLabel userNameLabel = new JLabel();
       
       userNameLabel.setBounds(200, 80, 200, 100);
       
       userNameLabel.setFont(userNameLabel.getFont().deriveFont(15f));
     
       userNameLabel.setText("User Name");
     
      JTextField userNameField = new JTextField();
      userNameField.setBounds(400, 100, 200, 30);
      
      
     JLabel passwordLabel = new JLabel();
     
     passwordLabel.setText("Password");
     
     passwordLabel.setFont(passwordLabel.getFont().deriveFont(15f));
   
     passwordLabel.setBounds(200, 150, 100, 100);
     
     JTextField passwordField= new JTextField();
     
     passwordField.setBounds(400, 250, 200, 30);
     
     JButton Login = new JButton("Login");
     
     Login.setBounds(400, 350, 100, 30);
     
     
      loginFormButton.add(userNameLabel);
      
      loginFormButton.add(userNameField);
      
      loginFormButton.add(passwordLabel);
      
      loginFormButton.add(passwordField);
      
      loginFormButton.add(Login);
      
      loginFormButton.add(title);
      
      
       setVisible(true);
      
      
    }
    
   
}
