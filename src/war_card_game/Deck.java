package war_card_game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck
{
    ArrayList<Card> deck = new ArrayList<>();
    
    
    public Deck()
    {
        this.deck = new ArrayList<Card>();
       
    }
 
    public ArrayList<Card> createDeck()
    {
        //ArrayList<Card> decK=null;
        for(Suit s: Suit.values())
            for(Value v: Value.values())
            {
                //decK.add(new Card(s, v));
                this.deck.add(new Card(s, v));
            }
        //return decK;
        return deck;
    
    }
    
    public ArrayList<Card> draw5cards()
    {
        ArrayList<Card> drawn = new ArrayList<>();
        
        Card card1 = this.deck.get(0);
        Card card2 = this.deck.get(1);
        Card card3 = this.deck.get(2);
        Card card4 = this.deck.get(3);
        Card card5 = this.deck.get(4);
        
        drawn.add(card1);
        drawn.add(card2);
        drawn.add(card3);
        drawn.add(card4);
        drawn.add(card5);
        
        this.deck.remove(0);
        this.deck.remove(1);
        this.deck.remove(2);
        this.deck.remove(3);
        this.deck.remove(4);
        
//        for(Card c : drawn)
//        {
//            System.out.print(c);
//        }
//        System.out.println();
        
        return drawn;   
    }
    public Card draw1card()
    {
        Card card = this.deck.get(0);
        this.deck.remove(0);
        System.out.println();
        
        return card;
    }
    
    public void shuffle()
    {     
        Collections.shuffle(this.deck);
    
    }
    
    public int deckSize()
    {
        int size;
        size = this.deck.size();
        
        return size;
    }
    
    @Override
    public String toString()
    {
        int i =1;
        String name = "";
        for(Card c: this.deck)
        {
            name += "\n" + i +"-" +c;
            i++;
        }
        
        return name;
    
    }
  

}
