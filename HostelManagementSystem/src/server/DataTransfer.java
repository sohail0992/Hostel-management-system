/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Sohail
 */
public class DataTransfer extends UnicastRemoteObject implements DataInterface  {
    String msg;
    public DataTransfer(String message) throws RemoteException 
    {
     msg = message;
    
    }
    
    public String say()
    {
      return msg;
    }

    @Override
    public String message() {
     return msg;
    }

    @Override
    public void save(String input) throws RemoteException {
        System.out.print(input);
     
    }
    
}
