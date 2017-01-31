package Vedensky.Eugene;

import java.util.Scanner;

/**
 * Created by eugenevendensky on 1/30/17.
 */
public class InputOutput {
    Scanner scanner = new Scanner(System.in);

    public int printPlayerHandValue(int valueOfHand) {
        System.out.println("The current value of your hand is " + valueOfHand);
        return valueOfHand;
    }

    public int askPlayerToStayOrDraw() {
        System.out.println("Would you like to stay or hit? 1 to hit, 2 to stay.");
        return scanner.nextInt();
    }

    public boolean askPlayer() {
        System.out.println("Would you like to play Black Jack?");

        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("Yes")) {
            return true;
        }
        if (choice.equalsIgnoreCase("No")) {
            return false;
        }
        return true;
    }

    public void printCardsInHand() {
        System.out.println("You have the following cards");
    }

    public int askPlayerWhatCardToDraw() {
        System.out.println("Pick a card from your hand");
        int z = scanner.nextInt();
        return z;
    }

    public void congratulate() {
        System.out.print("Congratulations, you win!");
    }
    public void congratulateNPC() {
        System.out.print("Sorry, the NPC won!");
    }
    public void tookACard(){
        System.out.println("You took the following card from the npc:");
    }
    public void didNotHave(){
        System.out.println("The NPC did not have that card");
        System.out.println("You draw a card from the deck");

    }
}




