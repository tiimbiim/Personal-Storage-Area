
import java.util.Scanner;
public class HW3_2 
{
	public static void main(String[] args)
	{
		Scanner bim = new Scanner(System.in);
		int year;
		System.out.println("Enter a year");
		year  = bim.nextInt();
		
		if(year < 1582)
		{
			System.out.println("Enter a year greater than 1582.");
			year = bim.nextInt();
		}

		if(year%4 == 0 && year%100 != 0)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year");
	}
}
