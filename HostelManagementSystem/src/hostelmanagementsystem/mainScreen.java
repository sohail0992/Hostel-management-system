/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @ Abdul Waheed Muhammad Sohail
 */
public class mainScreen extends JFrame {
   
    
    public mainScreen()
    {
     initUI();
    }
    
    
  
    private  void initUI()
    {
      
        

      setBounds(0, 0, 900, 660);
      
      setName("mainFrame");
      
      setTitle("Great Student Hostel");
     
      setDefaultCloseOperation(EXIT_ON_CLOSE);
    
      JPanel container = new JPanel();
      
      container.setLayout(null);
     // container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
      
      
      add(container);
      
      JPanel panelLabel = new JPanel();
      
      panelLabel .setLayout(null);
      
      panelLabel.setBounds(0,0, 900,100);
      
      panelLabel.setBackground(new Color(0,199,0));
      
     //label panel and labe     
    
      JLabel label = new JLabel();
      
      
      label.setFont(label.getFont().deriveFont(29.0f));
      
      label.setForeground(Color.white);
      
      label.setText("Welcome To Kashmir Boys Hostle");
       
      label.setVerticalAlignment(JLabel.BOTTOM);
       
      label.setBounds(230,5, 500,60);
      
      container.add(panelLabel);
      
      panelLabel.add(label);
      
      
      
      JPanel imagepanel = new JPanel();
      
      imagepanel.setBounds(200,100, 700,420);
       
      imagepanel.setBackground(new Color(199,199,199));
      
       container.add(imagepanel);
      
      // image 
        //BufferedImage myPicture = ImageIO.read(new File("path-to-file"));
         //JLabel picLabel = new JLabel(new ImageIcon(myPicture));
      // imagepanel.add(picLabel);
      
      JPanel panelButton = new JPanel();
       
       panelButton.setLayout(null);     
     
       panelButton.setBackground(Color.green);
     //panelButton.setSize(30,60);
     
      panelButton.setBounds(0,100, 200,420);
      
      container.add(panelButton);
      
      JButton home = new JButton("Home");
      
      home.setBounds(0, 0, 200, 70);
     // home.setPreferredSize(new Dimension(80,80));
      
      home.setFont(home.getFont().deriveFont(18f));
      
      panelButton.add(home);
      
      JButton admin = new JButton("Admin");
      admin.setBounds(0, 70, 200, 70);
      admin.setFont(admin.getFont().deriveFont(18f));
      
    //  facilities.setPreferredSize(new Dimension(80,80));
      
      panelButton.add(admin);
      
      JButton join = new JButton("Join");
      
      join.setBounds(0, 140, 200, 70);
      
      join.setFont(join.getFont().deriveFont(18f));
      
     // join.setPreferredSize(new Dimension(80,80));
      
      panelButton.add(join);
      
      JButton payments = new JButton("Payment");
      
      payments.setBounds(0, 210, 200, 70);
      
      payments.setFont(payments.getFont().deriveFont(18f));
      
    //  payments.setPreferredSize(new Dimension(80,80));
      
      panelButton.add(payments);
      
      JButton rules = new JButton("Rules");
      
      rules.setBounds(0, 280, 200, 70);
      
      rules.setFont(rules.getFont().deriveFont(18f));
      
      rules.setPreferredSize(new Dimension(80,80));
      
      panelButton.add(rules);
      
      JButton about = new JButton("Students");
      
      about.setBounds(0, 350, 200, 70);
      
      about.setFont(about.getFont().deriveFont(18f));
     
      panelButton.add(about);
         
      JPanel footer = new JPanel();
      
      footer.setBounds(0,520, 900,100);
      
      footer.setBackground(Color.pink);
   
      container.add(footer);
              
      JLabel footerLabel = new JLabel("<html><p>Developers: M.Sohail, Hassan Munir, Abdul Waheed <br> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Address: Islamabad Pakistan <br> &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp;Mobile: +923449335275</p></html>");
      
      footerLabel.setFont(footerLabel.getFont().deriveFont(17f));
      
      footerLabel.setVerticalTextPosition(JLabel.BOTTOM);
      
      footerLabel.setVerticalAlignment(JLabel.BOTTOM);
      
      footer.add(footerLabel);
      
      
              
      this.setVisible(true);
  
     
      //action listener
      
      home.addActionListener((ActionEvent e) -> {
      });
      
    
    
    
       rules.addActionListener((ActionEvent e) -> {
      });
      
    
    

      admin.addActionListener((ActionEvent e) -> {
          this.setVisible(false);
          Admin adObj = new Admin();
          adObj.setVisible(true);
        
      });
      
    
    

      join.addActionListener((ActionEvent e) -> {
          this.setVisible(false);
          Student stdObj = new Student();  
      
      });
      
    
    

      payments.addActionListener((ActionEvent e) -> {
      });
      
      
    
    
    }
    
    
    
}
