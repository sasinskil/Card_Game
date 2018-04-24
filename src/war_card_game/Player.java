package war_card_game;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Player 
{
    private String nick;
    Deck deck;
    
    public Player(String nick, Deck deck)
    {
        this.nick = nick;
        this.deck = deck;
    }
    
     @Override
    public String toString()
    {
        return this.nick + " ";
    
    }
    
    public void game(Player other) throws InterruptedException
    {
        Random random = new Random();
        
        int pointsP1=0, pointsP2=0, round=1, cardP1, cardP2, choiceP1, choiceP2;
        ArrayList<Card> handp1;
        ArrayList<Card> handp2;
        Card c1;
        Card c2;
        
        handp1 = this.deck.draw5cards();
        handp2 = other.deck.draw5cards();
        System.out.println();
        
        do
        {
            
            choiceP1 = random.nextInt(4);
            choiceP2 = random.nextInt(4);
            
            System.out.println("Round: " + round);
            System.out.println();
           
            
            System.out.printf("%s's hand (%d) ",this.nick,this.deck.deckSize());
            
            for(Card cc1 : handp1)
            {
                System.out.print(cc1);
            }
            System.out.println();
            
             System.out.printf("%s's hand (%d) ",other.nick,other.deck.deckSize());
             
            for(Card cc2 : handp2)
            {
                
                System.out.print(cc2);
            }
            System.out.println();
            
            System.out.printf("%s's choice : ",this.nick);
            System.out.println(handp1.get(choiceP1));
            System.out.printf("%s's choice : ",other.nick);
            System.out.println(handp2.get(choiceP2));
            
            c1 = handp1.get(choiceP1);
            c2 = handp2.get(choiceP2);
            
            cardP1 = c1.calcCardStrength();
            cardP2 = c2.calcCardStrength();
            
            if(cardP1 > cardP2)
            {
                System.out.println("Round winner " + this.nick);
                pointsP1 +=10;
            }
            else if (cardP1 > cardP2)
            {
                System.out.println("Round winner " + other.nick);
                pointsP2 +=10;
            }
            else
            {
                System.out.println("The same card's strength! :)");
                pointsP1 +=10;
                pointsP2 +=10;
            }
            
            System.out.printf("%s's points : %d",this.nick, pointsP1);
            System.out.println();
            System.out.printf("%s's points : %d",other.nick, pointsP2);
            System.out.println();
            TimeUnit.SECONDS.sleep(3);
            
            handp1.remove(choiceP1);
            handp2.remove(choiceP2);
            
            Card k1 = this.deck.draw1card();
            Card k2 = other.deck.draw1card();
            
            handp1.add(k1);
            handp2.add(k2);

            round++;
            
         }while (pointsP1 <= 50 && pointsP2 <=50);
        
        if(pointsP1>pointsP2)           
            System.out.printf("Winner: %s \n", this.nick);
        else if (pointsP2>pointsP1)
            System.out.printf("Winner: %s \n",other.nick);
        else
            System.out.println("There is no winner! :)");
    
    }

}
