import java.util.Scanner;
public class hw6_1 
{
	public static void main(String[] args) 
	{
		Scanner bim = new Scanner(System.in);
		int[] num = new int[5];             
		System.out.println("Enter the numbers (0 to 50)");
		int record = 0;
		for(int i = 0; i < num.length; i++)
		{
			num[i] = bim.nextInt();
			while(num[i] < 0 || num[i] >= 50)
			{
				System.out.println("Input another number");
				num[i] = bim.nextInt();
			}
		}
		
	}

}
