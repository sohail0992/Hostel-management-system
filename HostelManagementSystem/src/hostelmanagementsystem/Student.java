/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.SQLException;
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
   
    
    private String name;
    
    private String fatherName;
    
    private BigInteger  cnic;
    
    private Date dateOfBirth;
    
    private String educationLevel;
    
    private String collegeName;
    
    private double marks;
      
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
     
     JButton submitButton = new JButton("Register");
     
     submitButton.setBounds(300, 450, 200, 30);
      
     
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
     
     Registration.add(submitButton);
     
     
     
     submitButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              
           // DateFormat df = new SimpleDateFormat("MM/dd/yyyy");   
              
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
            
            name = nameField.getText();
            
            fatherName = f_nameField.getText();
            
            try
            {
            cnic = cnic.add(new BigInteger(cnicField.getText()));
          
             try {
                    dateOfBirth = formatter.parse(dobField.getText());
                } catch (ParseException ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                }
             
             educationLevel = prevEducationField.getText();
             
             collegeName =    prevCollegeField.getText();
             
             marks  =   Double.parseDouble(prevMarksField.getText());
             
            }
            catch(NumberFormatException nfe )
            {
             System.out.println(nfe);
            }
                    
            
              
          database.DataBase connectivity = new database.DataBase();
      
        try {
            Connection connection = connectivity.getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
     
      String sql = "INSERT INTO 'students' (name,cms,cnic,father_name,date_of_birth,education_level,college_name,marks) VALUES (name,cnic,fatherName,dateOFBirth,educationLevel,collegeName,marks) ";
     
        try {
            connectivity.Update_Query(sql);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
   
             
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
    public BigInteger getCnic() {
        return cnic;
    }

    /**
     * @param cnic the cnic to set
     */
    public void setCnic(BigInteger cnic) {
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
     * @return the marks
     */
    public double getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(double marks) {
        this.marks = marks;
    }
        
          
    
}
