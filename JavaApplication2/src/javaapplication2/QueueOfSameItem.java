/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;

/**
 *
 * @author rand_
 */
public class QueueOfSameItem {
    ArrayList<Item> items; 
    int positionRow; 
    int positionColumn; 
    boolean isActive = true ; 
    QueueOfSameItem( int positionRow, int positionColumn) {
        items = new ArrayList<Item>();
        this.positionColumn=positionRow; 
        this.positionRow= positionRow;
        
    }
    public int getSize(){
    return items.size();
    }
    
    public Item getItem() {
        ///// check if it's not empty 
        
        Item selectedItem = items.get(items.size()-1);// store the last enserted element 
        items.remove(items.get(items.size()-1));     //  remove it form the lest 
        return selectedItem;                        //   serve it to the customer 
        
    }

    public void addItem(Item item) {
        items.add(item);
    }
    
    public String getIdQueue(){
    return positionRow+""+positionColumn;
    } 

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

   
    
    
   
    
    
    
    
    
}
