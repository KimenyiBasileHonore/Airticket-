/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airTicket.model;

/**
 *
 * @author xxx
 */
public class Client  implements java.io.Serializable{
    private int clientid;
    private String fullname;
    private String passportNumber;
    private String phoneNumber;

    public Client(String fullname, String passportNumber, String phoneNumber) {
        this.fullname = fullname;
        this.passportNumber = passportNumber;
        this.phoneNumber = phoneNumber;
    }

    public Client() {
    }

    public String getFullname() {
        return fullname;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
}
