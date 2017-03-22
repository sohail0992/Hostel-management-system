/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.math.BigInteger;
import java.sql.Connection;
import java.util.Date;
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
    
    private double  cnic;
    
    private Date dateOfBirth;
    
    private String educationLevel;
    
    private String collegeName;
    
    private String sql;
    
    private double securityFee;
      
    public Student()
    {
                initUI();
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
    title .setBounds(250, 0, 500, 50);
     title .setText("Student Registration Form");
      title.setFont(title.getFont().deriveFont(25f));
      title.setForeground(Color.white);
     Registration.add(title);
     
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
     
     
<<<<<<< HEAD
     JLabel prevEducationLabel = new JLabel();
      prevEducationLabel.setBounds(200, 250, 200, 100);
     prevEducationLabel.setText("Education Level");
     prevEducationLabel.setFont(prevEducationLabel.getFont().deriveFont(15f));
     JTextField prevEducationField = new JTextField();
      prevEducationField.setBounds(400, 285, 200, 30);
      
      
     JLabel prevCollegeLabel = new JLabel();
     prevCollegeLabel.setBounds(200, 300, 100, 100);
     prevCollegeLabel.setText("College Name");
     prevCollegeLabel.setFont(prevCollegeLabel.getFont().deriveFont(15f));
     JTextField prevCollegeField = new JTextField();
     prevCollegeField.setBounds(400, 335, 200, 30);
     
     JLabel sec = new JLabel();
     sec .setBounds(200, 350, 200, 100);
     sec .setText("Security Fee");
    sec.setFont(sec.getFont().deriveFont(15f));
     JTextField prevMarksField = new JTextField();
     prevMarksField.setBounds(400, 385, 200, 30);
=======
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
>>>>>>> 904c802cac85f4251423d886bf08caa299ecb75c
     

     JLabel securityFeeLabel = new JLabel();
     securityFeeLabel.setBounds(200, 350, 100, 100);
     securityFeeLabel.setText("Security Fee");
     securityFeeLabel.setFont(securityFeeLabel.getFont().deriveFont(15f));
     JTextField securityFeeField = new JTextField();
     securityFeeField.setBounds(400, 385, 200, 30);


     JButton submitButton = new JButton("Register");
     
     submitButton.setBounds(450, 470, 100, 30);
      
     
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
     
<<<<<<< HEAD
     Registration.add(sec);
     
     Registration.add(prevMarksField);
=======
     Registration.add(securityFeeLabel);

     Registration.add(securityFeeField);

>>>>>>> 904c802cac85f4251423d886bf08caa299ecb75c
     
     Registration.add(submitButton);
     
     setVisible(true);
     
     
<<<<<<< HEAD
     submitButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              
           // DateFormat df = new SimpleDateFormat("MM/dd/yyyy");   
              
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
            
            name = nameField.getText();
            
            fatherName = f_nameField.getText();
            
            
            try
            {
            cnic =  Double.parseDouble(cnicField.getText());
          
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
     
      String sql = "INSERT INTO 'students' (name,father_name,cnic,,date_of_birth,education_level,college_name,marks) VALUES (hhh,fatherName,cnic,dateOFBirth,educationLevel,collegeName,security Fee) ";
=======
     
>>>>>>> 904c802cac85f4251423d886bf08caa299ecb75c
     
     submitButton.addActionListener((ActionEvent e) -> {
         // DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
         //      SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
         name = nameField.getText();
         fatherName = f_nameField.getText();
         educationLevel = educationField.getText();
         collegeName =    collegeField.getText();
//            cnic = cnic.add(new BigInteger(cnicField.getText()));
//          dateOfBirth = formatter.parse(dobField.getText());

//   securityFee = Double.parseDouble(securityFeeField.getText());



       sql = "INSERT INTO `students` (`name`, `cnic`, `father_name`,`date_of_birth`, `eductionLevel`, `college_name`, `securityFee`) VALUES"
        + " ('"+name+"', '"+cnic+"', '"+fatherName+"', '"+dateOfBirth+"', '"+educationLevel+"', '"+collegeName+"','"+securityFee+"');";

    String  displayAllSql = "Select * from students";

database.DataBase connectivity = new database.DataBase();



    Connection connection = connectivity.getConnection();
   // connectivity.Update_Query(sql,connection);
    connectivity.displayAll(displayAllSql, connection);
 
   
     });
             
    }

    /**
     * @return the name
     */
    @Override
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
