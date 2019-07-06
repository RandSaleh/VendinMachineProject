
import javaapplication2.Machine;
import static javaapplication2.Machine.*;
import org.junit.*;

import org.junit.Test;

public class TestAddingCoinsType {
    Machine machine ;
    
    @Before 
    public void init(){
    machine = getInstance();
    }
    
  @Test 
  public void testAddingCoin (){
  
  machine.addCoin(10);
  machine.addCoin(10);
  Assert.assertEquals(20, machine.getBalance(), 0);
  }
  
  @Test 
  public void testAddingNotes (){
      /*I assume that the machine will convert the 10 notes to 1000c directly to have formal way to calculate
       So the aalowed notes is 20 and 50, will convert to 2000 and 50000 so it's allowed 
      */
  machine.addNotes(2000);
  machine.addNotes(2000);
  Assert.assertEquals(4000, machine.getBalance(), 0);
  }
  
  
  @Test 
  public void testAddingCard (){
      /* All card's type accepted 
      I assume the card will be readed directly throw the machine card slot to simplify the idea 
      */
  machine.addCard(2000);
  machine.addCard(2000);
  Assert.assertEquals(4000, machine.getBalance(), 0);
  }
  
  
  
}
