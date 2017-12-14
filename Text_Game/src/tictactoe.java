import java.util.Scanner;

public class tictactoe {
	
	/*public static void turn() {
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		String oldin = in;
		int turn = 0;
		if (oldin != in)
			turn++;

		if (turn % 2 == 0)
			System.out.println("Player 1's turn");
		else
			System.out.println("Player 2's turn");
	}*/

	public static void tile() 
	{
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		String oldin = in;
		int turn = 0;
		if (oldin != in)
			turn++;
		
		int pturn = turn%2;
		if (pturn == 0)
			System.out.println("Player 1's turn");
		else
			System.out.println("Player 2's turn");

		int TopL, TopM, TopR, MidL, MidM, MidR, BotL, BotM, BotR;

		while (pturn == 0) 
		{
			if (scan.nextLine().equals("TopL"))
				TopL = 1;

			else if (scan.nextLine().equals("TopM"))
				TopM = 1;

			else if (scan.nextLine().equals("TopR"))
				TopR = 1;

			else if (scan.nextLine().equals("MidL"))
				MidL = 1;

			else if (scan.nextLine().equals("MidM"))
				MidM = 1;

			else if (scan.nextLine().equals("MidR"))
				MidR = 1;

			else if (scan.nextLine().equals("BotL"))
				BotL = 1;

			else if (scan.nextLine().equals("BotM"))
				BotM = 1;

			else if (scan.nextLine().equals("BotR"))
				BotR = 1;

		}
		
		while (pturn == 1) 
		{
			if (scan.nextLine().equals("TopL"))
				TopL = 2;

			else if (scan.nextLine().equals("TopM"))
				TopM = 2;

			else if (scan.nextLine().equals("TopR"))
				TopR = 2;

			else if (scan.nextLine().equals("MidL"))
				MidL = 2;

			else if (scan.nextLine().equals("MidM"))
				MidM = 2;

			else if (scan.nextLine().equals("MidR"))
				MidR = 2;

			else if (scan.nextLine().equals("BotL"))
				BotL = 2;

			else if (scan.nextLine().equals("BotM"))
				BotM = 2;

			else if (scan.nextLine().equals("BotR"))
				BotR = 2;

		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Tic Tac Toe");
		System.out.println("To chose a tile enter (TopL, TopM, TopR, MidL, MidM, MidR, BotL, BotM, BotR)");
		System.out.println("Player 1's turn  //this code is garbage");
		tile();
		
		
	}
}
