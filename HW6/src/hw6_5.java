
import java.util.Scanner;
public class hw6_5
{
	public static void main(String[] args)
	{
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		int ten = 0;
		Scanner bim = new Scanner(System.in);
		int [] num = new int[10];
		System.out.println("Enter the numbers (must be 1-100)");
		
		for(int i = 0; i < num.length; i++)
		{
			num[i] = bim.nextInt();
			if(num[i] < 1 || num[i] > 100)
			{
				System.out.println("Enter another number (must be 1-100)");
				num[i] = bim.nextInt();
			}
		}
		for(int i = 0; i <num.length; i++)
		{
			if(num[i] <= 10)
				one++;
			else if(num[i] >= 11 && num[i] < 21)
				two++;
			else if(num[i] >= 21 && num[i] < 31)
				three++;
			else if(num[i] >= 31 && num[i] < 41)
				four++;
			else if(num[i] >= 41 && num[i] < 51)
				five++;
			else if(num[i] >= 51 && num[i] < 61)
				six++;
			else if(num[i] >= 61 && num[i] < 71)
				seven++;
			else if(num[i] >= 71 && num[i] < 81)
				eight++;
			else if(num[i] >= 81 && num[i] < 91)
				nine++;
			else
				ten++;
		}
		
		System.out.print("1 - 10"); 
		for(int i = 0; i < one/5; i++)
			System.out.print("*");
		System.out.println();
		System.out.print("11 - 20");
		for(int i = 0; i < two/5; i++)
			System.out.print("*");
		System.out.println();
		System.out.print("21 - 30");
		for(int i = 0; i < three/5; i++)
			System.out.print("*");
		System.out.println();
		System.out.print("31 - 40");
		for(int i = 0; i < four/5; i++)
			System.out.print("*");
		System.out.println();
		System.out.print("41 - 50");
		for(int i = 0; i < five/5; i++)
			System.out.print("*");
		System.out.println();
		System.out.print("51 - 60");
		for(int i = 0; i < six/5; i++)
			System.out.print("*");
		System.out.println();
		System.out.print("61 - 70");
		for(int i = 0; i < seven/5; i++)
			System.out.print("*");
		System.out.println();
		System.out.print("71 - 80");
		for(int i = 0; i < eight/5; i++)
			System.out.print("*");
		System.out.println();
		System.out.print("81 - 90");
		for(int i = 0; i < nine/5; i++)
			System.out.print("*");
		System.out.println();
		System.out.print("91 - 100");
		for(int i = 0; i < ten/5; i++)
			System.out.print("*");
	}
}
