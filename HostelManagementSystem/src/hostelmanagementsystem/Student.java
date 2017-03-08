/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sohail
 */
public class Student extends JFrame{
    
    public Student()
    {
                initUI();
    }
    
    private void initUI()
    {
    
      setVisible(true);
  
      setBounds(0, 0, 900, 700);
      
      setName("mainFrame");
      
      setTitle("Great Student Hostel");
     
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      
     JPanel Registration = new JPanel();
     
     add(Registration);
     
     JLabel nameLabel = new JLabel();
     
     nameLabel.setText("Name");
     
     JTextField nameField = new JTextField();
     
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
