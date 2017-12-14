import java.util.Scanner;
import java.text.DecimalFormat;
public class HW2_10 {

	public static void main(String[] args) {
		
double a,b,c;
Scanner bim = new Scanner(System.in);
DecimalFormat dim = new DecimalFormat("#.###");

System.out.println("Please enter the values for the variables: ");
System.out.println("a: ");
a = bim.nextInt();
System.out.println("b: ");
b = bim.nextInt();
System.out.println("c: ");
c = bim.nextInt();


double s = (a + b + c)/2;    //s represents half the perimeter
double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

System.out.println("The area is: " + dim.format(area));


				
				
				
				
	}

}
