import java.util.Scanner;
public class HW2_4 {
	
	
	
public static void main(String []args)
{
	Scanner bim = new Scanner (System.in);
	
	System.out.println("Please input a temperature in fahrenheit: ");	
	int Ftemp = bim.nextInt();
	System.out.println("Your inputted temperature: " + Ftemp);
	
	
	int conversionC = (Ftemp-32)*5/9;
	
	System.out.println("temperature in celsius: " + conversionC);
	
	
	
	
	
	
}

}
