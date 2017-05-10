/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import static java.time.Clock.system;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Abdul Waheed
 */
public class manageStudents extends JFrame{
       
    public manageStudents()
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
    title .setBounds(330, 0, 500, 50);
     title .setText("Manage Students");
      title.setFont(title.getFont().deriveFont(25f));
      title.setForeground(Color.white);
     Registration.add(title);
      
     
      JButton editstd = new JButton("Edit Student");
     editstd.setBounds(100, 100, 140, 60);
     editstd.setFont(editstd.getFont().deriveFont(16f));
     
     
      JButton deletestd = new JButton("Delete Student");
   deletestd.setBounds(300, 200, 160, 60);
  deletestd.setFont(deletestd.getFont().deriveFont(16f));
     
     JButton searchstd = new JButton("Search Student");
   searchstd.setBounds(500, 300, 160, 60);
searchstd.setFont(searchstd.getFont().deriveFont(16f));
  
JButton backButton  = new JButton("Back");
     backButton.setBounds(100, 570, 100, 30); 
     backButton.setFont(backButton.getFont().deriveFont(16f));

JButton exitButton = new JButton("Exit");
     exitButton.setBounds(550, 570, 100, 30);
     exitButton.setFont(exitButton.getFont().deriveFont(16f));

JButton homeButton  = new JButton("Home");
     homeButton.setBounds(760, 10, 100, 30); 
     homeButton.setFont(homeButton.getFont().deriveFont(16f));
     
     Registration.add(homeButton);
     Registration.add(backButton);
     Registration.add(exitButton); 
     Registration.add(editstd);
      Registration.add(deletestd);
       Registration.add(searchstd);
     this.setVisible(true);
     
     
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
                     manageStudents.this.setVisible(false);
                     Admin obj = new Admin();
                      obj.setVisible(true);
                  }
     });
     
     exitButton.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e1) {
                     System.exit(0);
                      
                  }
              });
}
      
   
}