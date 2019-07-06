
import javaapplication2.Item;
import javaapplication2.Machine;
import static javaapplication2.Machine.*;
import static javaapplication2.Machine.VALID_PURCHASE;
import static javaapplication2.Machine.getInstance;
import javaapplication2.QueueOfSameItem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rand_
 * The user select valid ID but it's empty 
 * 
 */
public class TestPurchaseItemFromEmptyRow {
    Machine machine ; 
    QueueOfSameItem queue1; 
    @Before 
    public void init(){
    machine = getInstance();
    queue1 = new QueueOfSameItem(1,1); // row 1 column 1 
    machine.addQueueOfItems(queue1); // empty queue with pattert 11
    machine.addCoin(10); /// balance 10c 
    }
    @Test 
    public void testPurchaseItemFound () {
    Assert.assertEquals(EMPTY_SELECTED_PATTERN,machine.getFromSelectedQueue("11"));
    }
}
