/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import database.DataBase;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author Abdul Waheed
 */
public class saveData extends JFrame{
       
    public saveData ()
    {
      initUI();    
    }
    
    private void initUI()
    {
        try {
            FileInputStream fis = null;
            
            setBounds(0, 0, 900, 660);
            
            setName("mainFrame");
            
            setTitle("Great Student Hostel");
            
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            Student dd = Student.getStudent();
            
            JPanel Registration = new JPanel();
            
            Registration.setBackground(new Color(0,199,0));
            
            add(Registration);
            
            Registration.setBounds(0,0, 900,660);
            
            Registration.setLayout(null);
            //deserialize
            
            fis = new FileInputStream("student.ser");
            
            ObjectInputStream ois;
            
          
            ois = new ObjectInputStream(fis);
            
            
            
            dd = (Student)ois.readObject();
            
            Object[][] row = {{  "Name", "Father Name","CNIC","Date of Birth" ,"Education Level","College Name","Security Fee"},{ dd.getName(), dd.getFatherName(),dd.getCnic(), dd.getDateOfBirth() ,dd.getEducationLevel(), dd.getCollegeName(),dd.getSecurityFee()}};
            String []col = { "Name", "Father Name","CNIC","Date of Birth" ,"Education Level","College Name","Security Fee"};
            JTable table = new JTable(row,col);
            table.setFont(table.getFont().deriveFont(12f));
            table.setBounds(100, 50, 600, 400);
            //table.add(model);
            Registration.add(table);
            JButton backButton  = new JButton("Back");
            backButton.setBounds(100, 590, 100, 30);
            backButton.setFont(backButton.getFont().deriveFont(16f));
            JButton exitButton = new JButton("Exit");
            exitButton.setBounds(550, 590, 100, 30);
            exitButton.setFont(exitButton.getFont().deriveFont(16f));
            Registration.add(backButton);
            Registration.add(exitButton);
            this.setVisible(true);
            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ee) {
                    saveData.this.setVisible(false);
                    mainScreen obj = new  mainScreen();
                    obj.setVisible(true);
                }
            });    exitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e1) {
                    System.exit(0);
                    
                }
            });
        } catch (IOException ex) {
            Logger.getLogger(saveData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(saveData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        }
}
