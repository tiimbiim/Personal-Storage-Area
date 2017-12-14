
import java.util.Scanner;
public class HW3_6 
{
	public static void main(String[] args)
	{
		Scanner bim = new Scanner(System.in);
		System.out.println("Enter an integer");
		String i = bim.nextLine();
		int even = 0, odd = 0, zero = 0;
		
		for(int l = 0; l < i.length(); l++)
		{
			if (i.charAt(l)%2 == 1)
				odd++;
			else if(i.charAt(l)%2 == 0 && i.charAt(l)%9 == 0)
				zero++;
				
			else
				even++;
		
		}
	
		System.out.println("There were " + even + " evens, " + odd + " odds and " + zero + " zeros.");
	}
}
