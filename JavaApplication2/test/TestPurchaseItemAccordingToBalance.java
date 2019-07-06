
import javaapplication2.Item;
import javaapplication2.Machine;
import static javaapplication2.Machine.*;
import javaapplication2.QueueOfSameItem;
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
public class TestPurchaseItemAccordingToBalance {
    Machine machine ; 
    QueueOfSameItem queue1; 
    Item item ; 
    
    @Before 
    public void init(){
    machine = getInstance();
    queue1 = new QueueOfSameItem(1,1); // row 1 column 1 
    for (int i =0 ; i <1000 ; i ++){
    item = new Item(i,5);
    queue1.addItem(item);
    machine.addQueueOfItems(queue1);
    }
    }
    @Test 
    public void testPurchaseItemNoEnoughBalance(){
    Assert.assertEquals(0, machine.getBalance(),0); /// Idon't want to insert money 
    Assert.assertEquals(NO_ENOGH_BALANCE,machine.getFromSelectedQueue("11"));
    }
    
    
}
