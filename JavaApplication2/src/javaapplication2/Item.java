/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author rand_
 * There's a a 5 rows and 5 columns each (row,column) contain a queue of element 
 * I choose the id to be pressed in order to purchase  the item  to be the same if because it's after each other
 * as a queue according to the following pattern (number of row and column ).
 * 
 */
public class Item {
    int idItem; 
    double price ; 
    public Item(int idItem, double price) {
        this.idItem = idItem;
        this.price = price;
    }
 
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   
    
    
}
