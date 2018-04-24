
package war_card_game;


public enum Value 
{
    ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6),
    SEVEN(7),EIGHT(8),NINE(9),TEN(10),ELEVEN(11);
    
    int truename;
    
    private Value(int truename)
    {
        this.truename = truename;
    }
    
    public int getTrueName()
    {
        return this.truename;
    }
    
}
