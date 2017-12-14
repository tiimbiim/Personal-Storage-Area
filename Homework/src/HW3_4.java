
import java.util.Scanner;
public class HW3_4 
{
	public static void main(String[] args)
	{
		while(true)
		{
			Scanner bim = new Scanner(System.in);
			int a;
			System.out.println("Enter an intger.");
			a = bim.nextInt();
			
			if(a< 2)
			System.out.println("Enter an integer greater than 2.");
			
			while(a >= 2)
			{
				if(a%2 == 0)
				System.out.println(a);
				a--;
			}
			
				
		}
	}
}
