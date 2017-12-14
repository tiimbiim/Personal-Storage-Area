import java.util.Scanner;
public class HW2_8 {

	public static void main(String[] args)
	{
		int x1;
		int y1;
		int y2;
		int x2;
		
		Scanner bim = new Scanner(System.in);
		
		System.out.println("Enter values for X1, X2, Y1, Y1");
		System.out.print("X1: ");
		x1 = bim.nextInt();
		System.out.print("X2: ");
		x2 = bim.nextInt();
		System.out.print("Y1: ");
		y1 = bim.nextInt();
		System.out.print("Y2: ");
		y2 = bim.nextInt();
		
		double distForm = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		
		System.out.println("Distance between points is: " + distForm);
		
		
		
		
		
	}
	
	
}
