
import java.util.Random;
import java.util.Scanner;

public class die 
{
	public int roll()
	{
		
		Random rim = new Random();
		Scanner bim = new Scanner(System.in);
		System.out.println("Enter the number of sides you want on the die");
		
		int side = bim.nextInt();
		side = rim.nextInt(side)+1;

		System.out.println("The die landed on " + side);
		return side;
		
	}
}
