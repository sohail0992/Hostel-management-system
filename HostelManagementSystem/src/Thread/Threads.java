/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import hostelmanagementsystem.Student;
import hostelmanagementsystem.mainScreen;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sohail
 */
public class Threads implements Runnable {
    
    private String threadName;
    
    private Thread t;
    
    hostelmanagementsystem.Student s = Student.getStudent();
          
    
    
    public void start()          
    {
        if(t == null)
        {
          t = new Thread(this,threadName);
          t.start();
        }
     
       
    }


   public Threads(String name)
   {
     threadName = name;
   }
   
   
    @Override
    public void run()
    {
      
           
            
           if(t.toString().contains("Serialize"))
           {    
                SerializeDeserialize.Serialize.serialize(s);
                
              //  JOptionPane.showMessageDialog(Threads, "Serialized ");
                
               
           }
           
           else if(t.toString().contains("Db_Thread"))
           {
             String sql;
           
           
             sql = "INSERT INTO `users` (`name`,`father_name`, `cnic`, `date_of_birth`, `eductionLevel`, `college_name`, `securityFee`) VALUES"
                   + " ('"+s.getName()+"', '"+s.getFatherName()+"',  '"+s.getCnic()+"', '"+s.getDateOfBirth()+"', '"+s.getEducationLevel()+"', '"+s.getCollegeName()+"','"+s.getSecurityFee()+"');";
           
        //     String  displayAllSql = "SELECT name , father_name , cnic , date_of_birth , eductionLevel ,college_name ,securityFee FROM students";
           
              database.DataBase connectivity = new database.DataBase();
             
               try {
                   connectivity.Update_Query(sql);
                   
                   JOptionPane.showMessageDialog(null, "Student Added Successfully");
                   
                   Thread.sleep(2000);
                   
                    s.setVisible(false);
                   
                    mainScreen ms = new mainScreen();
                   
               } catch (SQLException | ClassNotFoundException | InterruptedException ex) {
                   Logger.getLogger(Threads.class.getName()).log(Level.SEVERE, null, ex);
               }
                   
            
           
           
           
           }
           
       }
           
           
        
    public String getThreadName() {
        return threadName;
    }
    
 
    
}

