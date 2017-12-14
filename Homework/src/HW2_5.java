import java.util.Scanner;
public class HW2_5 {

	public static void main(String []args)
	{
		float miles;
	
		
		Scanner bim  = new Scanner (System.in);
		
		
		System.out.println("Please enter an amount in miles: ");
	miles = bim.nextInt();
	
		double  conversion = miles*1.60935;
	
	System.out.println(miles + " miles to kilometers is: " + conversion);
		
	}
	
	
}
