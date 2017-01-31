package Vedensky.Eugene;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static junit.framework.TestCase.assertEquals;

public class GoFishTest {
    GoFish goFish;

    @Before
    public void setup() {
        goFish = new GoFish();
    }

    @Test
    public void dealTest() {
        goFish.deal();
        int expected = (goFish.player.hand.size());
        int actual = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void checkMatchTest(){
        Card card6 = new Card(Ranks.NINE, Suite.HEARTS, true);
        Card card1 = new Card(Ranks.TEN, Suite.HEARTS, true);
        Card card5 = new Card(Ranks.NINE, Suite.HEARTS, true);
        Card card2 = new Card(Ranks.TEN, Suite.HEARTS, true);
        Card card3 = new Card(Ranks.TEN, Suite.HEARTS, true);
        Card card4 = new Card(Ranks.TEN, Suite.HEARTS, true);
        goFish.player.hand.add(card6);
        goFish.player.hand.add(card1);
        goFish.player.hand.add(card5);
        goFish.player.hand.add(card2);
        goFish.player.hand.add(card3);
        goFish.player.hand.add(card4);

        boolean expected = true;
        boolean actual = goFish.checkMatch(goFish.player.hand);
        assertEquals(expected, actual);

    }
    @Test
    public void printCardsInHandTest(){
        goFish.deal();
        goFish.printCardsInHand(goFish.player);
        //Method does what I expect it to do, which is show the user the cards.
    }
    @Test
    public void askForCard(){
        Card card6 = new Card(Ranks.NINE, Suite.HEARTS, true);
        Card card1 = new Card(Ranks.TEN, Suite.HEARTS, true);
        Card card5 = new Card(Ranks.NINE, Suite.HEARTS, true);
        Card card2 = new Card(Ranks.TEN, Suite.HEARTS, true);
        Card card3 = new Card(Ranks.TEN, Suite.HEARTS, true);
        Card card4 = new Card(Ranks.TEN, Suite.HEARTS, true);
        goFish.player.hand.add(card6);
        goFish.player.hand.add(card1);
        goFish.player.hand.add(card5);
        goFish.player.hand.add(card2);
        goFish.player.hand.add(card3);
        goFish.player.hand.add(card4);
        goFish.askForCard(10, goFish.npc, goFish.player);
        goFish.printCardsInHand(goFish.npc);

    }
    @Test
    public void goFishAITest(){
        Card card6 = new Card(Ranks.NINE, Suite.HEARTS, true);
        Card card1 = new Card(Ranks.TEN, Suite.HEARTS, true);
        Card card5 = new Card(Ranks.NINE, Suite.HEARTS, true);
        Card card2 = new Card(Ranks.TEN, Suite.HEARTS, true);
        Card card3 = new Card(Ranks.TEN, Suite.HEARTS, true);
        Card card4 = new Card(Ranks.TEN, Suite.HEARTS, true);
        goFish.deal();
        goFish.player.hand.add(card6);
        goFish.player.hand.add(card1);
        goFish.player.hand.add(card5);
        goFish.player.hand.add(card2);
        goFish.player.hand.add(card3);
        goFish.player.hand.add(card4);
        goFish.goFishAI();
        goFish.printCardsInHand(goFish.npc);
        goFish.printCardsInHand(goFish.player);
        int actual = goFish.npc.bookCounter;
        int expected = 0;
        assertEquals(actual, expected);

    }
}

