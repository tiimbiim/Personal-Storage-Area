import java.util.Scanner;

public class hw6_2
{
   public static void main (String [] args)
   {
      int [] aim = new int [51];
      Scanner bim = new Scanner (System.in);

      System.out.println ("Enter the numbers (-25 to 25)");
      System.out.println ("End the list by inputing a number outside of the range");
      int input = bim.nextInt ();
      while (input >= -25 && input <= 25)
      {
         aim [input + 25] ++;
         input = bim.nextInt ();
      }

      System.out.println ("Number\tTimes");
      for (int check = -25; check <= 25; check++)
         if (aim [check+25] >= 1)
            System.out.println (check + "\t" + aim [check+25]);
   }
}
