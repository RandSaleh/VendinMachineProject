
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
    
    @Before 
    public void init (){
    machine = getInstance();
    }
    
    @Test 
    public void addingItemsToSameQueue(){
    Item item ; 
    for (int i =0 ; i <10 ; i ++){}
    item = new Item( i,5);
    
    }
    
}
