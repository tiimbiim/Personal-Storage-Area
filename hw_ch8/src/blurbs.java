import java.util.Random;

public class blurbs {
	
	// blurb = whoozit > 1+ whatzit
	//whatzit = q > z or d > whoozit
	//whoozit = x > 0 or Ys
	
	public static void main (String []args)
	{
		Random rim = new Random();
		int g = rim.nextInt(5)+1;
		
	System.out.println(blurbCreator(g));
		
	}
	
	public static String whoozit(int b)
	{
		Random rim = new Random();
		int a = rim.nextInt(2);
		String result = "";
		
		
		if(b == 0)
			return result;
		
		
		if(a == 1)
			result = "x";
		else
			result = "x" + "y";
		
		return result + whoozit(b-1);
	}
	
	public static String whatzit(int b)
	{
		Random rim = new Random();
		int t = rim.nextInt(2);
		String result = "";
		
		if(b == 0)
			return result;
		
		if(t == 1)
			result = "q" + "z";
		
		else
			result = "q" + "d";
		
		return result + whatzit(b-1);
	}
	
	public static String blurbCreator(int blurbLength)
	{
		Random rim = new Random();
		String result = "";
		int rand = rim.nextInt(10)+1;
		
		if(blurbLength == 0)
			return result;
		
		
		result = (whoozit(rand) + whatzit(rand));
		return result + blurbCreator(blurbLength-1);
	}

}
