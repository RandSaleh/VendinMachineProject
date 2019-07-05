/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author rand_
 * SingleTone Keypad ti implement only one keypad  each time 
 */
public class Keypad {
    int digit1;
    int digit2; 

    public Keypad(int digit1, int digit2) {
        this.digit1 = digit1;
        this.digit2 = digit2;
    }

    public int getDigit1() {
        return digit1;
    }

    public void setDigit1(int digit1) {
        this.digit1 = digit1;
    }

    public int getDigit2() {
        return digit2;
    }

    public void setDigit2(int digit2) {
        this.digit2 = digit2;
    }
    
    
    
    
}
