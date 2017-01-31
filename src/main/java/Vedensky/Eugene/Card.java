package Vedensky.Eugene;

/**
 * Created by eugenevendensky on 1/27/17.
 */
public class Card {
    Ranks rank;
    Suite suite;
    boolean visible;
    public Card(Ranks rank, Suite suit, boolean visible){
        this.rank = rank;
        this.suite = suit;
        this.visible = visible;
    }
    public void flip(){
        if(visible = true){
            visible = false;
        }
        else{
            visible = true;
        }
    }

    }

