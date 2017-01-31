package Vedensky.Eugene;



import java.util.Collections;
import java.util.Stack;

public class Deck extends Stack {


   public Deck(){
       makeDeck();
    }
    public void makeDeck() {
        for (Suite i : Suite.values()) {
            for (Ranks z : Ranks.values()) {
                Card card = new Card(z, i, false);
                push(card);
            }
        }
    }

        }


