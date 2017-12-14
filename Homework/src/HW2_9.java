import java.text.DecimalFormat;
public class HW2_9 {

	public static void main(String[] args)
	{
		double radius =1;       
		DecimalFormat dim = new DecimalFormat("#.####");
		double Vol = (Math.pow(radius, 3))* (1.333333333333333333333333333333333333) *Math.PI;
		double SA = 4*(Math.pow(radius, 2))*Math.PI;
		
		
		System.out.println("Volume is: " + dim.format(Vol));
		System.out.println("SA is: " + dim.format(SA));
		
	}
}
