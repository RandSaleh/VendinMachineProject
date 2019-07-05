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
 * Singleton  pattern design to implement only one machine 
 *  I've put a variable to detect which window is used 
 * assume  the used window will be activated autimaticaly if the user pay from it 
 * to allow me show that I put a function 
 */
public class Machine {
   private static Machine machine = null ;
   ArrayList<QueueOfSameItem> QueuesOfItems;
   Monitor monitor ; 
   Keypad keypad ; 
   double balance =0 ; 
   boolean isActiveCoinWindow= false ; 
   boolean isActiveNotesWindow=false; 
   boolean isActiveCardWindow = false ; 

   private Machine() {
        QueuesOfItems = new ArrayList<QueueOfSameItem>();
        monitor = new Monitor () ;
        keypad = new Keypad();
        
    }

   public static Machine getInstance(){
       if (machine == null){
       return new Machine();
       }
       else return machine ; 
   }
   

    public ArrayList<QueueOfSameItem> getQueuesOfItems() {
        return QueuesOfItems;
    }

    public void addQueueOfItems(QueueOfSameItem queueOfItems) {
        QueuesOfItems.add(queueOfItems);
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keypad getKeypad() {
        return keypad;
    }
    
    public QueueOfSameItem getSelectedQueue(String id ){
     
    for (QueueOfSameItem q : getQueuesOfItems()){
        System.out.println("Test "+q.getIdQueue());
        if (q.getIdQueue().equals("11")){
          return q; 
        }
        
    }
         return null ;
    
    }
    
    
    //--- Money Issue 
    
   public void addBalance(double amount){
       // chaeck which window is used ? 
       /// 1$ = 100 c and we ensert it as a coin 
       if (isActiveCoinWindow == true){
           if (amount==10 || amount ==20 || amount == 50 || amount ==100  ){
           balance+=amount ;
           }
           
           
       }
       else 
       if (isActiveCardWindow == true ){
           balance+=amount ; //// add the amount also in cent 
           
       }
       else 
       if ( isActiveNotesWindow == true ){
       if ( amount == 2000 || amount ==5000 ) /// 20$ or 50$ = > 2000c or 5000c 
       balance+=amount ;
       
       }
       
   /*
       
       •	Money Slots: the machine accepts money of the following types:
o	CoinSlot: There are four denominations: • 10c • 20c • 50c • $1 
o	CardSlot : all cards accepted
o	Notes Slot :20$ and 50$ only
o	Machine only accepts USD currency

       
       */
       /// validation 
       
   }

    public double getBalance() {
        return balance;
    }
   
    
    public void addCoin(double amount){
    isActiveCoinWindow = true ;
    addBalance(amount);
    }
    public void addCard(double amount){
    /// Assume the amount will be readed directly from the card 
    isActiveCardWindow = true; 
    addBalance(amount);
    };
    public void addNotes(double amount){
    isActiveNotesWindow=true; 
    addBalance(amount);
    };
   
    
       
}
