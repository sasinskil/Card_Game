package war_card_game;

public class Card
{
    private Suit suit;
    private Value value;
     
    public Card(Suit suit, Value value)
    {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
    
    public int calcCardStrength()
    {
        int val=this.value.getTrueName();
        
        int value=0;
        
        switch(suit)
        {
            case JESTER:
                value=5 + val;
                break;
            case QUEEN:
                value=10 + val;
                break;
            case KING:
                value=15 + val;
                break;
            case ASS:
                value=20 + val;
                break;
            default:
                System.out.println("Unknown!");
                break;     
        }
        return value;
 
    }
    
    @Override
    public String toString()
    {
        return suit.toString() +"-"+ value.toString() +"("+
                +this.calcCardStrength()+") ";
    
    }
  
}
