

import java.util.Scanner;
import java.util.Random;

public class HW3_16 
{
	public static void main(String[] args) 
	{
		Scanner bim = new Scanner(System.in);
		System.out.println("Do you want to play slots. (y/n)");
		String str = bim.nextLine();
		while(str.equals("y")) 
		{
			Random rand = new Random();
			int r = rand.nextInt(8) + 1;
			int r1 = rand.nextInt(8) + 1;
			int r2 = rand.nextInt(8) + 1;
			int i = 0;
			
			System.out.println("The numbers were " + r + "-" + r1 + "-" + r2 + ".");
			if(r == r1 && r1 == r2)
			{
				
			System.out.println("You win all three numbers were the same!");
			}
			else if(r == r1 || r1 == r2 || r == r2) {
				System.out.println("Close, but not quite. Roll again.");
			
			}
			else {
				System.out.println("Your money is going down the drain.");
			
			}
			System.out.println("Do you want to play again? (y/n)");
			str = bim.nextLine();
			
		}
		
	}
}

