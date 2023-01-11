/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airTicket.model;

import java.util.Date;

/**
 *
 * @author klion
 */
public class Ticket implements java.io.Serializable{

    private int ticketNumber;
    private String destination;
    private Date flightdate;
    private Client client;

    public Ticket(String destination, Date flightdate, Client client) {
      
        this.destination = destination;
        this.flightdate = flightdate;
        this.client = client;
    }

    public Ticket() {
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getDestination() {
        return destination;
    }

    public Date getFlightdate() {
        return flightdate;
    }

    public Client getClient() {
        return client;
    }
    
}
