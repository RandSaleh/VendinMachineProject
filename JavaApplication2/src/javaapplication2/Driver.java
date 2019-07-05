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
public class Driver {

    /**
     * @param args the command line arguments
     * Implement an instance of the machine 
     */
    public static void main(String[] args) {
     //// create item 
     /// assign it to spesific queue 
     // add the queue to the machine 
     Item item = new Item (1,4);
     QueueOfSameItem queueOfChoclate1 = new QueueOfSameItem(1,1);
     queueOfChoclate1.addItem(item);
     Machine machine = new Machine ();
     machine.addQueueOfItems(queueOfChoclate1);
     
     
     String pressed = 11+"";
     
     QueueOfSameItem itemSelected = machine.getSelectedQueue(pressed); ///// NULL
     
        System.out.println(itemSelected.getItem().idItem);    
     
     
     
     
    
    
}


}