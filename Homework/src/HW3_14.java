

import java.util.Scanner;

public class HW3_14
{
	public static void main(String[] args)
	{
		System.out.println("Enter a string.");
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String vowels = "aeiou";
		String Uvowels = "AEIOU";
		String consonants = "bcdfghjklmnpqrstvwxyz";
		String aVow = "a";
		String eVow = "e";
		String iVow = "i";
		String oVow = "o";
		String uVow = "u";
		
		int a = 0, e = 0, i =0, o = 0, u = 0;
		
		int v = 0, c = 0, s = 0, p = 0, Uv = 0;
		
		for(int l = 0; l< str.length(); l++)
		{
			if(vowels.contains((String.valueOf(str.charAt(l)))))
			{
				v++;
				if (aVow.contains((String.valueOf(str.charAt(l)))))
					a++;
				else if (eVow.contains((String.valueOf(str.charAt(l)))))
					e++;
				else if (iVow.contains((String.valueOf(str.charAt(l)))))
					i++;
				else if (oVow.contains((String.valueOf(str.charAt(l)))))
					o++;
				else
					u++;
					
				
			}
			else if(str.charAt(l) == ' ')
				s++;
			else if(consonants.contains(String.valueOf(str.charAt(l))))
				c++;
			else if(Uvowels.contains(String.valueOf(str.charAt(l))))
				Uv++;
			else
				p++;
		}
	
	
		
		System.out.println("You had " + v + " vowels, " + c + " consonants, " + s + " spaces, and " + p + " punctuation marks.");
		System.out.println("You had " + a + "As, " + e + "Es, " + i + "Is, " + o + "Os, and " + u + "Us.");
	}
}

