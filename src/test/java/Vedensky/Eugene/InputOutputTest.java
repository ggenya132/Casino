package Vedensky.Eugene;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by eugenevendensky on 1/30/17.
 */
public class InputOutputTest {

    InputOutput inputOutput;
    @Before
    public void setup(){ inputOutput = new InputOutput();}
    @Test
    public void printPlayerHandValueTest(){
        int actual = inputOutput.printPlayerHandValue(2);
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void askPlayerToStayOrDrawTest(){
        int actual = inputOutput.askPlayerToStayOrDraw();
        int expected = 2;
        assertEquals(expected, actual);
    }



}
