package Vedensky.Eugene;

import java.util.Collections;

/**
 * Created by eugenevendensky on 1/27/17.
 */
public abstract class CardGame {

    Player player = new Player();
    Player npc = new Player();
    Deck deck = new Deck();


    public CardGame() {

        shuffle();
    }
    public void npcAI(){
       if(checkValueHand(npc.hand.size(), npc) < 17){
           drawCardNPC();
           bustChecker(npc);
       }
    }
    public void deal() {
        player.hand.add(deck.pop());
        npc.hand.add(deck.pop());  //make deal just one;
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public boolean bustChecker(Player player) {
        boolean isBust = false;
        if (checkValueHand(player.hand.size(), player) > 21) {
            System.out.println(player+" has BUSTED!");
            isBust = true;
        }
        return isBust;
    }

    public void drawCard() {
        player.hand.add(deck.pop()); //check how this method interacts
    }
    public void drawCardNPC(){
        npc.hand.add(deck.pop());
    }
    public int checkValueHand(int cardsInHand, Player player) {
        int totalValue = 0;
        for (int i = 0; i < cardsInHand; i++) {
            totalValue += checkCardValue(i, player);
        }

        return totalValue;

    }

    public int checkCardValue(int cardInHand, Player player) {
        Card card = (Card) (player.hand.get(cardInHand));
        int z = 0;

        switch (card.rank) {
            case TWO:
                z = 2;
                return z;

            case THREE:
                z = 3;
                return z;

            case FOUR:
                z = 4;
                return z;


            case FIVE:
                z = 5;
                return z;

            case SIX:
                z = 6;
                return z;

            case SEVEN:
                z = 7;
                return z;

            case EIGHT:
                z = 8;
                return z;

            case NINE:
                z = 9;
                return z;

            case TEN:
                z = 10;
                return z;

            case JACK:
                z = 11;
                return z;

            case QUEEN:
                z = 12;
                return z;

            case KING:
                z = 13;
                return z;
            case ACE:
                z = 1;
                return z;

        }
        return z;
    }
}

