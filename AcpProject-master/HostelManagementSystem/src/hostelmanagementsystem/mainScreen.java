/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Abdul Waheed Muhammad Sohail
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
    
      JPanel container = new JPanel();
      
      //container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
      
      container.setLayout(null);
      add(container);
      
      JPanel panelLabel = new JPanel();
      panelLabel.setBounds(0, 0, 900, 100);
     //label panel and labe     
      panelLabel.setBackground(Color.yellow);
     
      JLabel label = new JLabel();
      label.setBounds(200, 150, 100, 100);
      label.setFont(label.getFont().deriveFont(29.0f));
    
      label.setText("Welcome To Great Sudents Hostol");
      
      container.add(panelLabel);
      
      panelLabel.add(label);
      
      //panel button and buttons
      
      JPanel panelButton = new JPanel(new GridLayout(2, 3,30 ,50));
     
      container.add(panelButton);
      
      JButton home = new JButton("Home");
      
      home.setPreferredSize(new Dimension(80,80));
      
      home.setFont(home.getFont().deriveFont(18f));
      
      panelButton.add(home);
      
      JButton facilities = new JButton("Facilities");
      
      facilities.setFont(facilities.getFont().deriveFont(18f));
      
      facilities.setPreferredSize(new Dimension(80,80));
      
      panelButton.add(facilities);
      
      JButton join = new JButton("Join");
      
      join.setFont(join.getFont().deriveFont(18f));
      
      join.setPreferredSize(new Dimension(80,80));
      
      panelButton.add(join);
      
      JButton payments = new JButton("Payments");
      
      payments.setFont(payments.getFont().deriveFont(18f));
      
      payments.setPreferredSize(new Dimension(80,80));
      
      panelButton.add(payments);
      
      JButton rules = new JButton("Rules");
      
      rules.setFont(rules.getFont().deriveFont(18f));
      
      rules.setPreferredSize(new Dimension(80,80));
      
      panelButton.add(rules);
      
      JButton about = new JButton("About Us");
      
      about.setFont(about.getFont().deriveFont(18f));
      
      about.setPreferredSize(new Dimension(80,80));
      
      panelButton.add(about);
      
      
      //3rd panel
      
      JPanel footer = new JPanel();
      
      container.add(footer);
              
      JLabel footerLabel = new JLabel("<html>Developers: M.Sohail Hassan Abdul Waheed <br> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Address: Islamabad Pakistan <br> &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp;Mobile: +923449335275</html>");
      
      footerLabel.setFont(footerLabel.getFont().deriveFont(17f));
      
      footerLabel.setVerticalTextPosition(footerLabel.BOTTOM);
      
      footerLabel.setVerticalAlignment(footerLabel.BOTTOM);
      
      footer.add(footerLabel);
      
     
      //action listener
      
      home.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
                        }
      });
      
    
    
    
       rules.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
                        }
      });
      
    
    

      facilities.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
                        }
      });
      
    
    

      join.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             
              
             Student stdObj = new Student();
             
             setVisible(false);
             
             stdObj.setVisible(true);
              
             }
      });
      
    
    

      payments.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
                        }
      });
      
    }
    
    
}
