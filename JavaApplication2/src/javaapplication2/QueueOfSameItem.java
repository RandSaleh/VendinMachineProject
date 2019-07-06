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
    
    public Item getItem(int pos) {
      
        if (items.size()>0){
       return  items.get(pos);
        }
        return null ;
        
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
    
    
    public void remove(Item item){
    items.remove(item);
    }

   
    
    
   
    
    
    
    
    
}
