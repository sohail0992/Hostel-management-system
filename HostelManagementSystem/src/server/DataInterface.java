/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Sohail
 */
public interface DataInterface extends Remote{
    
     public String message();
     public void save(String input) throws RemoteException;
}
