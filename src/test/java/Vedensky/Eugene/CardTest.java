package Vedensky.Eugene;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CardTest {

     Card card;

     @Before
     public void setup() {
          card = new Card(Ranks.TEN, Suite.HEARTS, true);  //this is a methods
     }

     @Test
     public void isFlippedTest(){
        card.flip();
        boolean actual = card.visible;
        boolean excpected = false;
        assertEquals(actual, excpected);
     }





}
