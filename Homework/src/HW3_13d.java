

public class HW3_13d 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 11; i++)
		{
			for(int h = 0; h < 11; h++)
			{
				System.out.print(" ");
				if(i+h > 9 && h - i > 1)
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
