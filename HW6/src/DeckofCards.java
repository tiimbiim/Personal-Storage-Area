
public class DeckofCards 
{
	public static void main(String []args)
	{
		Card cards = new Card();
		
		for(int t = 0; t < 4; t++)
		{
			for(int j = 0; j < 13; j++)
			{
				System.out.println(cards.toString());
				
			}
			System.out.println();
		}
	
}
}