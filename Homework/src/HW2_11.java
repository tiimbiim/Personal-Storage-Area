import java.util.Scanner;
public class HW2_11 {
	
	public static void main(String []args) 
	{
		Scanner bim = new Scanner (System.in);
		float gasUsed;
		float MpG;
		float odoStart;
		float odoEnd;
		
		   System.out.println("Input your staring odometer reading");
		      odoStart = bim.nextInt();
		      
		      System.out.println("Input your final odometer reading");
		      odoEnd = bim.nextInt();
		      
		      System.out.println("Input total gas used");
		      gasUsed = bim.nextFloat();
		      
		      MpG = (odoEnd- odoStart)/gasUsed;
		      
		      System.out.println("Your MpG is " + MpG + " MpG");
		     
		
		
		
		
	}

}
