import java.util.StringTokenizer;
import java.util.Scanner;
public class HW3_8 
{
	public static void main(String[] args) 
	{
		  {
		   Scanner bim = new Scanner(System.in);
			  int wordCount = 0, characterCount = 0;
		      String line, word;
		      StringTokenizer tokenizer;
		      int i = 0;

		      System.out.println ("Please enter text (type DONE to quit):");

		      line = bim.nextLine();
		      while (!line.equals("DONE"))
		      {
		         tokenizer = new StringTokenizer (line, " ");
		         while (tokenizer.hasMoreTokens())
		         {
		            word = tokenizer.nextToken();
		            if (word.equals(".") || word.equals(",") || word.equals(";") || word.equals(":") || word.equals("?") || word.equals("!"))
		            {
		            	i++;
		            }
		            wordCount++;
		            characterCount += word.length();
		         }
		         line = bim.nextLine();
		      }

		      System.out.println ("Number of words: " + wordCount);
		      System.out.println ("Number of characters: " + characterCount);
		   }
		}
}