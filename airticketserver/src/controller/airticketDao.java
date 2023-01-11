/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.client;
import model.ticket;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author xxx
 */
public class airticketDao { 
    public void saveclient (client clie){
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        
        try {
           session.save(clie);
           tx.commit();
        }
         catch(Exception e)
        {
            e.printStackTrace();
        }
    
    }
    
    public void saveticket (ticket tick){
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        
        try {
           session.save(tick);
           tx.commit();
        }
         catch(Exception e)
        {
            e.printStackTrace();
        }
    
    }
    
    public ArrayList<client>getclient()
    {
        Session se=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=se.beginTransaction();
        ArrayList<client> list=new ArrayList();
        try{
          Query q=se.createQuery("from client");
          list=(ArrayList)q.list();
          tx.commit();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
     
        return list;
}
    public ArrayList<ticket>getticket()
    {
        Session se=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=se.beginTransaction();
        ArrayList<ticket> list=new ArrayList();
        try{
          Query q=se.createQuery("from ticket");
          list=(ArrayList)q.list();
          tx.commit();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
}
}
