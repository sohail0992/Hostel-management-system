/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Abdul Waheed
 */
public class students_data extends JFrame {
        
    
    public students_data()
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
     title .setText("Registers Students");
      title.setFont(title.getFont().deriveFont(25f));
      title.setForeground(Color.white);
     Registration.add(title);
      
     this.setVisible(true);
}
    
    
}


