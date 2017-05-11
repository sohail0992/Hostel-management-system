/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import Thread.Threads;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sohail
 */
public class Student extends JFrame{
    
    private static final  Student std = new Student();
  
    private int count = 0;
    
    private String name;
    
    private String fatherName;
    
    private int  cnic;
    
    private Date dateOfBirth;
    
    private String educationLevel;
    
    private String collegeName;
    
    
    private double securityFee;
      
    
    private Student()
    {
      count++;
      if(count == 1)
      {
      initUI();    
      }
     }
    
    
    public static Student getStudent()
    {
         return std;
    }
    
    
    
    private void initUI()
    {
    
     
      
      setBounds(0, 0, 900, 660);
      
      setName("mainFrame");
      
      setTitle("Great Student Hostel");
     
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      
      
     JPanel Registration = new JPanel();
     Registration.setBackground(new Color(0,199,0));
     add(Registration);
      
     Registration.setLayout(null);
     
     
     JLabel title = new JLabel();
    title .setBounds(330, 0, 500, 50);
     title .setText("Student Registration Form");
      title.setFont(title.getFont().deriveFont(25f));
      title.setForeground(Color.white);
     Registration.add(title);
     
     
     JButton backButton  = new JButton("Back");
     backButton.setBounds(10, 10, 100, 30); 
     backButton.setFont(backButton.getFont().deriveFont(16f));
     
      JButton homeButton  = new JButton("Home");
     homeButton.setBounds(760, 10, 100, 30); 
     homeButton.setFont(homeButton.getFont().deriveFont(16f));

     JLabel nameLabel = new JLabel();
     nameLabel.setBounds(200, 50, 200, 100);
     nameLabel.setFont(nameLabel.getFont().deriveFont(15f));
     nameLabel.setText("Name");
     
     JTextField nameField = new JTextField();
      nameField.setBounds(400, 85, 200, 30);
      
      
     JLabel f_nameLabel = new JLabel();
     f_nameLabel.setText("Father Name");
    f_nameLabel.setFont(f_nameLabel.getFont().deriveFont(15f));
     f_nameLabel.setBounds(200, 100, 100, 100);
     JTextField f_nameField= new JTextField();
     f_nameField.setBounds(400, 135, 200, 30);
     
     
     JLabel cnicLabel = new JLabel();
     cnicLabel.setText("CNIC No");
    cnicLabel .setFont(cnicLabel .getFont().deriveFont(15f));
      cnicLabel.setBounds(200, 150, 100, 100);
      
     JTextField cnicField = new JTextField();
      cnicField.setBounds(400, 185, 200, 30);
      
     JLabel dobLabel = new JLabel();
      dobLabel.setBounds(200, 200, 100, 100);
     dobLabel.setText("Date of Birth");
      dobLabel.setFont( dobLabel.getFont().deriveFont(15f));
      
     JTextField dobField = new JTextField();
     dobField.setBounds(400, 235, 200, 30);
     

     JLabel educationLabel = new JLabel();
      educationLabel.setBounds(200, 250, 200, 100);
     educationLabel.setText("Education Level");
     educationLabel.setFont(educationLabel.getFont().deriveFont(15f));
     
     JTextField educationField = new JTextField();
      educationField.setBounds(400, 285, 200, 30);
      
      
     JLabel college = new JLabel();
     college.setBounds(200, 300, 100, 100);
     college.setText("College Name");
     college.setFont(college.getFont().deriveFont(15f));
     
     JTextField collegeField = new JTextField();
     collegeField.setBounds(400, 335, 200, 30);
     

     JLabel securityFeeLabel = new JLabel();
     securityFeeLabel.setBounds(200, 350, 100, 100);
     securityFeeLabel.setText("Security Fee");
     securityFeeLabel.setFont(securityFeeLabel.getFont().deriveFont(15f));
     
     JTextField securityFeeField = new JTextField();
     securityFeeField.setBounds(400, 385, 200, 30);


     JButton submitButton = new JButton("Register");
     submitButton.setBounds(350, 480, 130, 30);
     submitButton.setFont(submitButton.getFont().deriveFont(16f));
     
     JButton exitButton = new JButton("Exit");
     exitButton.setBounds(760, 570, 100, 30);
     exitButton.setFont(exitButton.getFont().deriveFont(16f));
     
     
     
     
     Registration.add(homeButton);
      
     Registration.add(backButton);
     
     Registration.add(nameField);
     
     Registration.add(nameLabel);
     
     Registration.add(f_nameLabel);
     
     Registration.add(f_nameField);
     
     Registration.add(dobLabel);
     
     Registration.add(dobField);
     
     Registration.add(cnicLabel);
     
     Registration.add(cnicField);
     
     Registration.add(educationLabel);
     
     Registration.add(educationField);
     
     Registration.add(college);
     
     Registration.add(collegeField);
     

     Registration.add(securityFeeLabel);

     Registration.add(securityFeeField);

     
     Registration.add(submitButton);
     
     Registration.add(exitButton);
    
     this.setVisible(true);
     
     
        submitButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              try {
                  String dateFormat = "21/3/2017";
                  
                  
                  DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    setName(nameField.getText());
                    setFatherName(f_nameField.getText());
                    setEducationLevel(educationField.getText());
                    setCollegeName(collegeField.getText());
                    setDateOfBirth(formatter.parse(dobField.getText()));
                  dateFormat =  formatter.format(getDateOfBirth());
                    setCnic(Integer.parseInt(cnicField.getText()));
                    setSecurityFee(Double.parseDouble(securityFeeField.getText()));
                   
                  Threads t;  
                  
                  t  = new Threads("Serialize");
                  
                  t.start();
                  
                  t = new Threads("Db_Thread");
                  
                  t.start();
                  
                 
              
              } catch (ParseException ex) {
                  Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
      });
        
        
        
          homeButton.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e1) {
                      setVisible(false);
                      mainScreen obj = new mainScreen();
                      obj.setVisible(true);
                  }
              }); 
             
              backButton.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent ee) {
                      Student.this.setVisible(false);
                      mainScreen obj = new mainScreen();
                      obj.setVisible(true);
                  }
              });
             
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the fatherName
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * @param fatherName the fatherName to set
     */
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    /**
     * @return the cnic
     */
    public int getCnic() {
        return cnic;
    }

    /**
     * @param cnic the cnic to set
     */
    public void setCnic(int cnic) {
        this.cnic = cnic;
    }

    /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the educationLevel
     */
    public String getEducationLevel() {
        return educationLevel;
    }

    /**
     * @param educationLevel the educationLevel to set
     */
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    /**
     * @return the collegeName
     */
    public String getCollegeName() {
        return collegeName;
    }

    /**
     * @param collegeName the collegeName to set
     */
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    /**
     * @return the securityFee
     */
    public double getSecurityFee() {
        return securityFee;
    }

    /**
     * @param securityFee the securityFee to set
     */
    public void setSecurityFee(double securityFee) {
        this.securityFee = securityFee;
    }


        
          
    
}
