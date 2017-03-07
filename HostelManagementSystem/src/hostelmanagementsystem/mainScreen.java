/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Abdul Waheed
 */
public class mainScreen extends JFrame {
    
    public mainScreen()
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
    
      JLabel label = new JLabel();
    
      label.setText("Welcome To Great Sudents Hostol");
     
      JPanel panelLabel = new JPanel();
      
      
      panelLabel.setBounds(0, 0, 900, 300);

      
      add(panelLabel);
      
      panelLabel.add(label);
      
      JPanel panelButton = new JPanel();
      
     panelButton.setBounds(0 , 300, 900, 300);
     
      add(panelButton);
      
      JButton home = new JButton("Home");
      
      panelButton.add(home);
      
      JButton facilities = new JButton("Facilities");
      
      panelButton.add(facilities);
      
      JButton join = new JButton("Join");
      
      panelButton.add(join);
      
      JButton payments = new JButton("Payments");
      
      panelButton.add(payments);
      
      JButton rules = new JButton("Rules");
      
      panelButton.add(rules);
      
    }
}
