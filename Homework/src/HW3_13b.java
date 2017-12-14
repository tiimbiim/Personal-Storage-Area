

public class HW3_13b
{

	public static void main(String[] args) 
	{
		for(int i = 0; i < 10; i++)
		{	
			
			for(int w = 10; w > i; w--)
			{
				System.out.print(" ");
			}
			
			for(int h = 0; h < i ; h++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
