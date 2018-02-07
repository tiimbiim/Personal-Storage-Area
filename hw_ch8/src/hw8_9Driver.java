
public class hw8_9Driver extends pascalTriangle
{

	public static void main(String[] args)
	{
		
		pascalTCaller(4, pascalT);
		
		for(int t = 0; t < 4; t++)
			System.out.print(pascalT[t] + "\t");
	}
	
}
