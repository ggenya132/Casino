package Vedensky.Eugene;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;



public class BlackJackTest {
    BlackJack blackJack;
    @Before
    public void setup(){ blackJack = new BlackJack();}

    @Test
    public void dealTest() {
        blackJack.deal();
        int actual = blackJack.player.hand.size();
        int expected = 2;
        assertEquals(expected, actual);
    }
//    @Test
//    public void checkValueTest() {
//        blackJack.deal();
//        int actual = blackJack.checkCardValue(0, player);
//        int expected = 1;
//        assertEquals(expected, actual);
//        }
    @Test
    public void checkValueHandTest() {
        blackJack.deal();
        blackJack.deal();
        int actual = blackJack.checkValueHand(blackJack.player.hand.size(), blackJack.player);
        int expected = 13;
        assertEquals(expected, actual);
    }
    @Test
    public void drawCardTest(){
        blackJack.deal();
        blackJack.drawCard();
        blackJack.drawCard();
        blackJack.drawCard();
        int actual = blackJack.player.hand.size();
        int expected = 5;
        assertEquals(expected, actual);
    }
//    @Test
//    public void bustCheckerTest(){
//        blackJack.deal();
//        blackJack.drawCard();
//        blackJack.drawCard();
//        blackJack.drawCard();
//        boolean actual = blackJack.bustChecker();
//        boolean expected = true;
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void interpretorTest() {
        blackJack.deal();
        blackJack.drawCard();
        blackJack.interpretor(1);
        int expected = 3;
        int actual = blackJack.player.hand.size();
        assertEquals(expected, actual);
    }
    @Test
    public void drawCardNPCTest(){
        blackJack.deal();
        blackJack.drawCardNPC();
        blackJack.drawCardNPC();
        int expected = 3;
        int actual = blackJack.npc.hand.size();
        assertEquals(expected, actual);

    }
    @Test
    public void npcAITest() {
        blackJack.deal();
        blackJack.npcAI();
        System.out.println(blackJack.npc.hand.size());
        int expected;
        if (blackJack.checkValueHand(blackJack.npc.hand.size(), blackJack.npc) >= 17) {
            expected = 2;
        } else {
            expected = 3;
        }

        int actual = blackJack.npc.hand.size();
        assertEquals(expected, actual);
        }
    @Test
    public void printNPCSizeAndFirstIndexValueTest(){
        blackJack.deal();
        int actual = 2;
        int expected;
        blackJack.printNPCSizeAndFirstIndexValue();
    }
    }




