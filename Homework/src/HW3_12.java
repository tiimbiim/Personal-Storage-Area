

import java.util.Scanner;

public class HW3_12 
{
	public static void main(String[] args) 
	{
		Scanner bim = new Scanner(System.in);
		String str, another = "y";
		String punc = ",.?;!:";
		int left, right;

		while (another.equalsIgnoreCase("y")) // allows y or Y
		{
			System.out.println("Enter a potential palindrome:");
			str = bim.nextLine();
			str = str.replace(".", "");
			str = str.replace(",", "");
			str = str.replace("?", "");
			str = str.replace("!", "");
			str = str.replace(":", "");
			str = str.replace(";", "");
			
			
			left = 0;
			right = str.length() - 1;

			while (str.charAt(left) == str.charAt(right) && left < right) 
			{
				left++;
				right--;
			}

			System.out.println();

			if (left < right)
				System.out.println("That string is NOT a palindrome.");
			else
				System.out.println("That string IS a palindrome.");

			System.out.println();
			System.out.print("Test another palindrome (y/n)? ");
			another = bim.nextLine();
		}
	}
}
