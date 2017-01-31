package Vedensky.Eugene;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeckTest {

    Deck deck;
    @Before
    public void setup(){
        deck = new Deck();
    }

    @Test
    public void makeDeckTest() {

        int actual = 52;  //add clear deck implementation
        int expected = deck.size();
        assertEquals(expected, actual);
    }



    }



