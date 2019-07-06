
import javaapplication2.*;
import static javaapplication2.Machine.*;
import org.junit.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rand_
 */
public class TestAddingItems {
    Machine machine ; 
    QueueOfSameItem queue1; 
    Item item ; 
    @Before 
    public void init (){
    machine = getInstance();
    queue1 = new QueueOfSameItem(1,1); // row 1 column 1 
    }
    
    @Test 
    public void addingItemsToSameQueue(){
    for (int i =0 ; i <1000 ; i ++){
    item = new Item(i,5);
    queue1.addItem(item);
    }
    Assert.assertEquals(1000,queue1.getSize()); // added 100
    }
    
    
}
