/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author rand_
 * This is just to simulate the screen to show the message 
 * 
 */
public class Monitor {
    String message ; 
    public Monitor() {  
    }
    public void  getMessage() {
        System.out.println(this.message);
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
