
import javaapplication2.Item;
import javaapplication2.Machine;
import static javaapplication2.Machine.*;
import static javaapplication2.Machine.getInstance;
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
 * Test purchase item found 
 * Test purchase item not found -- invalid id 
 * Test purchase item from empty queue with valid id 
 * Test purchase item without enough balance 
 * 
 */
public class TestPurchaseItem {
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
    machine.addCoin(10); /// balance 10c 
    }
    }
    
    @Test 
    public void testPurchaseItemFound () {
       Assert.assertEquals(VALID_PURCHASE,machine.getFromSelectedQueue("11"));
    }
    
    
    
    
}
