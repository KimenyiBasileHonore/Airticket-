/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author xxx
 */
@Entity
public class ticket { 
    @Id
    
    String clientid;
    String ticketnumber;
    String destination;
    String flightdate;

    public ticket() {
    }

    public ticket(String clientid, String ticketnumber, String destination, String flightdate) {
        this.clientid = clientid;
        this.ticketnumber = ticketnumber;
        this.destination = destination;
        this.flightdate = flightdate;
    }
    
    

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getTicketnumber() {
        return ticketnumber;
    }

    public void setTicketnumber(String ticketnumber) {
        this.ticketnumber = ticketnumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightdate() {
        return flightdate;
    }

    public void setFlightdate(String flightdate) {
        this.flightdate = flightdate;
    }
    
    
    
}
