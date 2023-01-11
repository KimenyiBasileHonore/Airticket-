/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import model.client;
import model.ticket;

/**
 *
 * @author xxx
 */
public interface bookinginterface extends Remote { 
    
     public void saveticket(ticket t)throws RemoteException;
    public void saveclient(client c)throws RemoteException;
    public ArrayList<ticket>getticket()throws RemoteException;
    public ArrayList<client>getclient()throws RemoteException;
    
}
