/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerializeDeserialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Sohail
 */
public class Serialize implements Serializable {
    
      
      public int j;
    
       public static void serialize(Serializable a)
       {
           try
           {
           
           FileOutputStream fos = new FileOutputStream("Student.ser");
           
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           
           oos.writeObject(a);
           
           oos.close();
           
           fos.close();
           
           }
           catch(IOException e)
           {
             System.out.println(e);
           }
       
       }
       
      
    
}

