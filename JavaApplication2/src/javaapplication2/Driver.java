/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Scanner;
import static javaapplication2.Machine.getInstance;

/**
 *
 * @author rand_
 */
public class Driver {
    public static void main(String[] args) {
      ///// assume we insert item in row 1 column 1 so the items in id 11 
     Machine machine = getInstance(); //// create instance
    ///create number of items 
    QueueOfSameItem  queue1 = new QueueOfSameItem(1,1); 
    Item item = null ; 
    for (int i = 0 ; i < 10 ; i ++ ){
    item = new Item (i,10) ; /// prices in cent 
    queue1.addItem(item);}
    machine.addQueueOfItems(queue1);
         
    Scanner in = new Scanner(System.in); //// Let the user choose 
    machine.getKeypad().setDigit1(in.nextInt()); //1
    machine.getKeypad().setDigit2(in.nextInt()); // 1 
    String pressed = machine.getKeypad().getPressed(); /// true 11 
   /// try to fetch tthe item 
    machine.addCoin(10);
   ///// try to purchase 
    Item itemSelected  = machine.getFromSelectedQueue(pressed);
          
}


}