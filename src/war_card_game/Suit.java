
package war_card_game;

public enum Suit
{
    WALET("W"),DAMA("D"),KROL("K"),ASS("A");
    
    String truename;
    
    private Suit(String truename)
    {
        this.truename = truename;
    }
    
    public String getTrueName()
    {
        return this.truename;
    }
}
