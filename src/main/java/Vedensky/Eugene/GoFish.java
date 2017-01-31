package Vedensky.Eugene;

import java.util.ArrayList;

/**
 * Created by eugenevendensky on 1/28/17.
 */

public class GoFish extends CardGame {
    InputOutput inputoutput = new InputOutput();
    public void drawCard(Player player) {
        player.hand.add(deck.pop());

    }
    public void deal() {
        for (int i = 0; i < 7; i++) {
            player.hand.add(deck.pop());
            npc.hand.add(deck.pop());  //

        }
    }
    public boolean checkMatch(ArrayList hand) {
        boolean isMatch = false;
        int matchInHandCounter = 0;

        for (int i = 0; i < hand.size() - 1; i++) {
            for (int z = i + 1; z < hand.size(); z++) {
                if (checkCardValue(i, player) == checkCardValue(z, player)) {
                    matchInHandCounter++;
                }
            }

        }
        if (matchInHandCounter >= 4) {
            isMatch = true;
        }
        return isMatch;
    }
    public void printCardsInHand(Player player){

        for(int i = player.hand.size() - 1; i >= 0; i--){
        System.out.print(checkCardValue(i, player) + " ");
        }
        System.out.println();
    }
    public void askForCard(int cardAskedFor, Player asking, Player giving){
        int matchCounter = 0;
        for(int i = giving.hand.size()-1; i >= 0; i--) {

            if (checkCardValue(i, giving) == cardAskedFor) {
                Card tempCard = (Card) giving.hand.get(i);
                asking.hand.add(tempCard);
                giving.hand.remove(i);
                inputoutput.tookACard();
                System.out.println(checkCardValue(asking.hand.size()-1, asking));
                asking.bookCounter++;
            }
        }

        if(matchCounter == 0){

            drawCard();

    }
        giving.hand.trimToSize();
    }
    public void goFishAI(){
        int z=  (int)Math.round((Math.random()*(npc.hand.size()-1)));
        int cardValue = checkCardValue(z, npc);
        askForCard(cardValue, npc, player);

        if(checkMatch(npc.hand)){
        }

    }
    public void main(){
        boolean fishing = true;
        this.deal();
        while(fishing){
        inputoutput.printCardsInHand();
        printCardsInHand(player);
        askForCard(inputoutput.askPlayerWhatCardToDraw(), player, npc);
        goFishAI();
        if(player.bookCounter == 4){
            inputoutput.congratulate();
            fishing = false;
        }
        if(npc.bookCounter == 4) {
            inputoutput.congratulateNPC();
            fishing = false;
        }
        }
    }

}