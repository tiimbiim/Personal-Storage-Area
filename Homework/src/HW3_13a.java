
public class HW3_13a 
{

	public static void main(String[] args) 
	{
		for(int i = 0; i < 10; i++)
		{	
			for(int h = 0; h < 10; h++)
				if(h+i <  9)
				System.out.print("*");
		
			System.out.println();
		}
	}
}
