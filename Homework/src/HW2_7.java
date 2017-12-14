import java.util.Scanner;
public class HW2_7 {

		public static void main(String[] args)
		
		{
			int hours; 
			int minutes;
			int seconds;
			
			Scanner bim = new Scanner(System.in);
			
			
			System.out.print("Enter a time in seconds: ");
			seconds = bim.nextInt();
			
			hours = seconds/3600;
			seconds = seconds -(hours*3600);
			minutes = seconds/60;
			seconds = seconds - (minutes*60);
			System.out.println(hours+"hours, " + minutes + "mins, " + seconds + "seconds");
			
		}
	
	
}
