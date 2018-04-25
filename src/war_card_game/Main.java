package war_card_game;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        
        Deck deck1 = new Deck();
        deck1.createDeck();
        
        Deck deck2 = new Deck();
        deck2.createDeck();
         
        Player p1 = new Player("Player1", deck1);
        Player p2 = new Player("Planyer2", deck2);
        
        p1.deck.shuffle();
        p2.deck.shuffle();
            
        p1.game(p2);
               
    }
    
}
