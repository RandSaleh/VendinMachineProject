/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import static javaapplication2.Machine.getInstance;

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
    Machine machine = getInstance(); //// create instance
    ///create number of items 
    QueueOfSameItem  queue1 = new QueueOfSameItem(1,1); 
    Item item = null ; 
    
    for (int i = 0 ; i < 10 ; i ++ ){
    item = new Item (i,10) ; /// prices in cent 
    queue1.addItem(item);
    }
    
    machine.addQueueOfItems(queue1);
    
    machine.getKeypad().setDigit1(1);
    machine.getKeypad().setDigit2(1);
    
   String pressed = machine.getKeypad().getPressed(); /// true 11 
   
   /// try to fetch tthe item 
   
   machine.addCoin(10);
   
   ///// try to purchase 
   
   Item itemSelected  = machine.getSelectedQueue(pressed).getItem();
   if (itemSelected.price <= machine.getBalance()){
   machine.balance-=itemSelected.price;
       System.out.println(itemSelected.getPrice()); 
       System.out.println(machine.balance);
       System.out.println(machine.getSelectedQueue(pressed).getSize());
   }
   
     
    
    
}


}