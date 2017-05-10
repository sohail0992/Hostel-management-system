/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Abdul Waheed
 */
public class Rules extends JFrame{
    
     public Rules()
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
     title .setText("Rules and Regulations");
      title.setFont(title.getFont().deriveFont(25f));
      title.setForeground(Color.white);
     Registration.add(title);
      
     
  JLabel r1 = new JLabel();
  r1 .setBounds(100, 100, 800, 30);
   r1 .setText("1.  Accommodation in the hostel is privilege and cannot be claimed as a right");
  r1.setFont( r1.getFont().deriveFont(16f));
    Registration.add(r1);
    
    
     JLabel r2 = new JLabel();
  r2 .setBounds(100, 150, 800, 30);
   r2 .setText("2.    Only those students, who are enrolled in the Institute," 
          +" will be allowed admission in the hostel.");
   r2.setFont( r2.getFont().deriveFont(16f));
    Registration.add(r2); 
    
    
     JLabel r3 = new JLabel();
  r3 .setBounds(100, 200, 800, 30);
   r3 .setText("3.    Accommodation in the hostel is to be provided on merit cum seniority basis.");
   r3.setFont( r3.getFont().deriveFont(16f));
    Registration.add(r3);
    
    
     JLabel r4 = new JLabel();
  r4 .setBounds(100, 250, 800, 30);
   r4 .setText("4.    Student will not be allowed to stay in hostel once they appear in the Final year examination.");
   r4.setFont( r4.getFont().deriveFont(16f));
    Registration.add(r4);
    
    
     JLabel r5 = new JLabel();
  r5 .setBounds(100, 300, 800, 30);
   r5 .setText("5.    Students are not allowed to change the room once allotted to him ");
   r5.setFont( r5.getFont().deriveFont(16f));
    Registration.add(r5);
    
    
     JLabel r6 = new JLabel();
  r6 .setBounds(100, 350, 800, 30);
   r6 .setText("6.    Overstay beyond the authorized period of academic session is not allowed.");
   r6.setFont( r6.getFont().deriveFont(16f));
    Registration.add(r6);
  
    JLabel r7 = new JLabel();
  r7 .setBounds(100, 400, 800, 30);
   r7 .setText("7.    Guests and outsiders are not allowed to stay in a hostel.");
   r7.setFont( r7.getFont().deriveFont(16f));
    Registration.add(r7);
    
       JLabel r8 = new JLabel();
  r8 .setBounds(100, 450, 800, 30);
   r8 .setText("8.    Entry of females into boy’s hostels and vice versa is strictly prohibited.");
   r8.setFont( r8.getFont().deriveFont(16f));
    Registration.add(r8);
    
JButton backButton  = new JButton("Back");
     backButton.setBounds(100, 570, 100, 30); 
     backButton.setFont(backButton.getFont().deriveFont(16f));

JButton exitButton = new JButton("Exit");
     exitButton.setBounds(550, 570, 100, 30);
     exitButton.setFont(exitButton.getFont().deriveFont(16f));


     
    
     Registration.add(backButton);
     Registration.add(exitButton); 
     
     this.setVisible(true);
     
     
        
     
     backButton.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent ee) {
                     Rules.this.setVisible(false);
                     mainScreen obj = new mainScreen();
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
