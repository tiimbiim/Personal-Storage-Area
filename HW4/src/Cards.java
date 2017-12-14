
import java.util.Random;
public class Cards
{
    Random rand = new Random();
    
    
    public final static int spade = 1;
    public final static int club = 2;
    public final static int diamond = 3;
    public final static int heart = 4;
    
    public final static int ace = 1;
    public final static int two = 2;
    public final static int three = 3;
    public final static int four = 4;
    public final static int five = 5;
    public final static int six = 6;
    public final static int seven = 7;
    public final static int eight = 8;
    public final static int nine = 9;
    public final static int ten = 10;
    public final static int jack = 11;
    public final static int queen = 12;
    public final static int king = 13;
    
    private final static int num_faces = 13;
    private final static int num_suit  = 4;
    
    private int face, suit;
    private String faceName, suitName;
    public Cards()
    {
        face = rand.nextInt(13)+1;
        suit = rand.nextInt(4)+1;
    }
    public String getFaceName()
    {
        return faceName;
    }
    public String getSuitName()
    {
        return suitName;
    }
    public String toString()
    {
       setfaceName();
       setsuitName();
       return  faceName + " of " + suitName;
    }
    public void setfaceName()
    {
        switch(face)
        {
            case ace:
                faceName = "ace";
                break;
            case two:
                faceName = "two";
                break;
            case three:
                faceName = "three";
                break;
            case four:
                faceName = "four";
                break;
            case five:
                faceName = "five";
                break;
            case six:
                faceName = "six";
                break;
            case seven:
                faceName = "seven";
                break;
            case eight:
                faceName = "eight";
                break;
            case nine:
                faceName = "nine";
                break;
            case ten:
                faceName = "ten";
                break;
            case jack:
                faceName = "jack";
                break;
            case queen:
                faceName = "queen";
                break;
            case king:
                faceName = "king";
                break;
        }
    }
    public void setsuitName()
    {
        if(suit == heart)
            suitName = "hearts";
        else if(suit == spade)
            suitName = "spades";
        else if(suit == diamond)
            suitName = "diamonds";
        else
            suitName = "clubs";

    }
}
