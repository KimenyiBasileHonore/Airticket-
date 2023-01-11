/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import controller.airticketDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import static java.time.Clock.tick;
import java.util.ArrayList;
import model.client;
import model.ticket;

/**
 *
 * @author xxx
 */
public class bookimpl  extends UnicastRemoteObject implements bookinginterface{  
        airticketDao dao=new airticketDao();

    @Override
    public void saveticket(ticket t) throws RemoteException {
        dao.saveticket(t);
    }

    @Override
    public void saveclient(client c) throws RemoteException {
        dao.saveclient(c);
    }

    @Override
    public ArrayList<ticket> getticket() throws RemoteException {
        ArrayList<ticket>l=dao.getticket();
       return l;
    }

    @Override
    public ArrayList<client> getclient() throws RemoteException {
         ArrayList<client>l=dao.getclient();
       return l;
    }
    
  
}
