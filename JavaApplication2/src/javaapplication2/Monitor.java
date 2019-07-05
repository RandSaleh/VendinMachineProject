/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author rand_
 * Singleton pattern to implement only one Monitor 
 * 
 */
public class Monitor {
    String message ; 

    public Monitor(String message) {
        this.message = message;
    }

    public void  getMessage() {
        System.out.println(this.message);
    }

    public void setMessage(String message) {
        this.message = message;
        
    }
    
    
    
}
