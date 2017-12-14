import java.util.Random;
public class Card 
{
	Random rand = new Random();
	public Card()
	{
		int[] num = new int[13];
		String[] suit = new String[4];
	}
	int face()
	{
		return rand.nextInt(13);
	}
	String suit()
	{
		int r1 = rand.nextInt(4);
		if(r1 == 1)
			return "Spade";
		else if(r1 == 2)
			return "Diamond";
		else if(r1 == 3)
			return "Heart";
		else
			return "Club";
	}
	public String toString()
	{
		String result;
		
		result = face() + " of "+  suit() + "\n";
		
		return result;
	}
}