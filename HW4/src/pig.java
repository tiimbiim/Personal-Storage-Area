

import java.util.Random;
import java.util.Scanner;
public class pig 
{
	public void game()
	{
		int player1 = 0;
		int player2 = 0;
		Scanner bim = new Scanner(System.in);
		Random rim = new Random();
		while(player1 < 100 && player2 < 100)
		{
			
			
			int playerturn = 0;
			
			
			if(playerturn == 0)
			{
				System.out.println("Player 1's turn");
				int roll1 = rim.nextInt(6)+1;
				int roll2 = rim.nextInt(6)+1;
				System.out.println("Roll 1 is " + roll1);
				System.out.println("Roll 2 is " + roll2);
				if(roll1 == 1 && roll2 == 1)
				{
					player1 = 0;
					System.out.println("Player 1's points : " + player1);
					playerturn++;
				}
				else if(roll1 == 1 || roll2 == 1)
				{
					System.out.println("Player 1's points : " + player1);
					playerturn++;
				}
				else
				{
					player1 = player1 + roll1 + roll2;
					System.out.println("Player 1's points : " + player1);
				}
				if(playerturn == 0)
				{
					System.out.println("Do you want to roll again?(y/n)");
					if(bim.nextLine().equals("n")) 
						playerturn++;
				}
				
				System.out.println();
			}
			if(playerturn == 1)
			{
				System.out.println("Player 2's turn");
				int roll1 = rim.nextInt(6)+1;
				int roll2 = rim.nextInt(6)+1;
				System.out.println("Roll 1 is " + roll1);
				System.out.println("Roll 2 is " + roll2);
				if(roll1 == 1 && roll2 == 1)
				{
					player2 = 0;
					System.out.println("Player 2's points : " + player2);
					playerturn--;
				}
				else if(roll1 == 1 || roll2 == 1)
				{
					System.out.println("Player 2's points : " + player2);
					playerturn--;
				}
				else
				{
					player2 = player2 + roll1 + roll2;
					System.out.println("Player 2's points : " + player2);
				}
				if(playerturn == 1)
				{
					System.out.println("Do you want to roll again?(y/n)");
					if(bim.nextLine().equals("n")) 
						playerturn--;
				}
				System.out.println();
			}
			
			System.out.println("Player 1's points " + player1);
			System.out.println("Player 2's points " + player2);
			System.out.println();
		
		}
		
		
	}
}
