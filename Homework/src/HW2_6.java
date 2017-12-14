import java.util.Scanner;
public class HW2_6 {

	public static void main(String[] args) 
	{
		int minutes;
		int hours;
		int seconds;
		
		
		Scanner bim = new Scanner(System.in);
		System.out.println("Please enter a time in the following format: hh, mm, ss");
		hours = bim.nextInt();
		minutes = bim.nextInt();
		seconds = bim.nextInt();
		
		System.out.println("Total time is: " + hours + "hours, " + minutes + "minutes, " + seconds + "seconds");
		
		int totalHours = hours*3600;
		int totalMins = minutes*60;
		int totalTime = totalHours+totalMins+seconds;
		
		System.out.println("Total time in seconds is: " + totalTime);
		
		
	}

}
