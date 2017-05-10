/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sohail
 */
public class DataRecive {
    
    
    
    public static void main(String[] args)
    {
      DataInterface data = null;  
      
      String name = "rmi://localhost/DataLink";
      
        try {
            data = (DataInterface)Naming.lookup(name);
        } catch (NotBoundException ex) {
            Logger.getLogger(DataRecive.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(DataRecive.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(DataRecive.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      System.out.println(data.message());
     
    }
    
}
