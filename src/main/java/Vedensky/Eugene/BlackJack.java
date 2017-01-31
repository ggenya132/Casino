package Vedensky.Eugene;

/**
 * Created by eugenevendensky on 1/28/17.
 */
public class BlackJack extends CardGame {

    InputOutput inputOutput = new InputOutput();


    public void printNPCSizeAndFirstIndexValue() {
        System.out.println("The NPC has " + npc.hand.size() + " cards.");
        System.out.println("The value of the first card is " + checkCardValue(0, npc));
    }

    public void deal() {
        for (int i = 0; i < 2; i++) {
            player.hand.add(deck.pop());
            npc.hand.add(deck.pop());
        }
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
                z = 10;
                return z;

            case QUEEN:
                z = 10;
                return z;

            case KING:
                z = 10;
                return z;
            case ACE:

                z = 11;
                return z;
        }
        return z;
    }


    public boolean interpretor(int hitOrStay) {
        if (hitOrStay == 1) {
            npcAI();
            printNPCSizeAndFirstIndexValue();
            drawCard();
            inputOutput.printPlayerHandValue(checkValueHand(player.hand.size(), player));
            npcAI();

            return bustChecker(player);
        }
        if (hitOrStay == 2) {
            if (checkValueHand(player.hand.size(), player) > checkValueHand(npc.hand.size(), npc)) {
                inputOutput.printPlayerHandValue(checkValueHand(player.hand.size(), player));
                System.out.println("You win!");
                System.out.println("The NPC had a total value of " + checkValueHand(npc.hand.size(), npc));
            }
            if (checkValueHand(player.hand.size(), player) < checkValueHand(npc.hand.size(), npc)) {
                inputOutput.printPlayerHandValue(checkValueHand(player.hand.size(), player));
                System.out.println("You lose!");
                System.out.println("The NPC had a total value of " + checkValueHand(npc.hand.size(), npc));
            }
            if (checkValueHand(player.hand.size(), player) == checkValueHand(npc.hand.size(), npc)) {
                inputOutput.printPlayerHandValue(checkValueHand(player.hand.size(), player));
                System.out.println("You tied!");
                System.out.println("The NPC had a total value of " + checkValueHand(npc.hand.size(), npc));
            }
            if (checkValueHand(player.hand.size(), player) == 21) {
                inputOutput.printPlayerHandValue(checkValueHand(player.hand.size(), player));
                System.out.println("You got 21 and automatically won");
                System.out.println("The NPC had a total value of " + checkValueHand(npc.hand.size(), npc));
            }

            if (checkValueHand(npc.hand.size(), npc) > 21) {
                inputOutput.printPlayerHandValue(checkValueHand(player.hand.size(), player));
                System.out.println("The NPC has busted! You win!");
                System.out.println("The NPC had a total value of " + checkValueHand(npc.hand.size(), npc));
            }

            return true;
        }
        return bustChecker(player);
    }

    public void main() {
        boolean startLoop = inputOutput.askPlayer();
        while (startLoop) {
            deal();

            printNPCSizeAndFirstIndexValue();
            inputOutput.printPlayerHandValue(checkValueHand(player.hand.size(), player));
            boolean notBust = true;
            while (notBust) {

                if (bustChecker(player)) {
                    notBust = false;
                }
                if (interpretor(inputOutput.askPlayerToStayOrDraw())) {
                    notBust = false;
                }
            }
        }
    }
}

