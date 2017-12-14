
import java.util.Scanner;
public class HW3_1 
{

	public static void main(String[] args) 
	{
		Scanner bim = new Scanner(System.in);
		int a, b, c;
		double avg;
		System.out.println("Enter three numbers.");
		a = bim.nextInt();
		b = bim.nextInt();
		c = bim.nextInt();
		
		if (bim.toString() == "end")
		{
			System.exit(0);
		}
		avg = (a + b + c) / 3.0;
		System.out.println("Your average is " + avg);
	}

}
