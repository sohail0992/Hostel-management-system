/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
   setBounds(0, 0, 900, 660);
      
      setName("mainFrame");
      
      setTitle("Great Student Hostel");
     
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      Student dd = new Student();
      
      
     JPanel Registration = new JPanel();
     Registration.setBackground(new Color(0,199,0));
     add(Registration);
       Registration.setBounds(0,0, 900,660);
     Registration.setLayout(null);
     
     Object[][] row = {{ "445", "458","44", "48" ,"445", "458","44"},{ "445", "458","44", "48" ,"445", "458","44"}};
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
     });
     
     exitButton.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e1) {
                     System.exit(0);
                      
                  }
              });
}
}
