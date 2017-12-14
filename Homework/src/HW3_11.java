
import java.util.Scanner;
import java.util.Random;
public class HW3_11
{
	public static void main(String[] args) 
	{
		Scanner bim = new Scanner(System.in);
		Random rand = new Random();
		int a, c, b = 0, high = 0, low = 0;
		
		System.out.println("Try to guess the number.");
		a = rand.nextInt(100)+1;
		
		while (b == 0) 
		{
			System.out.println("Please enter your guess");
			c = bim.nextInt();
				
			if(c>a) 
			{
				high++;
				System.out.println("You guessed to high.");	
			}
			else if (c<a) 
			{
				low++;
				System.out.println("You guessed to low.");
			}
			else
			{
				System.out.println("You guessed it!");
				System.out.println("You guessed too high " + high + " times");
				System.out.println("You guessed too low " + low + " times");
				break;
			}
		}
	}
}