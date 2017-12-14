
import java.util.Scanner;
public class HW3_5 
{
	public static void main(String[] args)
	{
		Scanner bim = new Scanner(System.in);
		System.out.println("Enter a string.");
		String str = bim.nextLine();
		int l = 0;
		while(l != str.length())
		{
			System.out.println(str.charAt(l));
			l++;
		}
	}
}
