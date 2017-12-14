
import java.util.Scanner;
import java.util.Random;
public class HW3_15 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want to play rock, paper, scissors.(y/n)");
		String str = scan.nextLine();
		
		while (str.equals("y"))
		{
			System.out.println("Pick rock, paper, or scissors.");
			str = scan.nextLine();
			str.toLowerCase();
			String com;
			Random rand = new Random();
			int c = rand.nextInt(3) + 1;
			int p;
			
			if(c == 1)
				com = "rock";
			else if (c == 2)
				com = "paper";
			else
				com = "scissors";
			
			if(str.equals(com))
			{
				System.out.println("Tie");
				System.out.println("You chose " + str + " and the computer chose " + com + ".");
			}
			else if((str .equals("paper") && com.equals("scissors")) || (str.equals("rock") && com.equals("paper")) || (str.equals("scissors") && str.equals("rock")))
			{
				System.out.println("You lost.");
				System.out.println("You chose " + str + " and the computer chose " + com + ".");
			}
			else
			{
				System.out.println("You won.");
				System.out.println("You chose " + str + " and the computer chose " + com + ".");
			}
			System.out.println("Do you want to play again?(y/n)");
			str = scan.nextLine();
		}
		System.exit(0);
	}
	
}
