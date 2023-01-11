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
public class client { 
    @Id
    
    String clientid;
    String fullname;
    String passportnumber;
    String phonenumber; 

    public client() {
    }

    public client(String clientid, String fullname, String passportnumber, String phonenumber) {
        this.clientid = clientid;
        this.fullname = fullname;
        this.passportnumber = passportnumber;
        this.phonenumber = phonenumber;
    }
    

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassportnumber() {
        return passportnumber;
    }

    public void setPassportnumber(String passportnumber) {
        this.passportnumber = passportnumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
}
