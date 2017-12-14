

public class HW3_13c {

	public static void main(String[] args) 
	{
		for(int i = 0; i < 10; i++)
		{
			for(int h = 0; h < i; h++)
			{
				System.out.print(" ");
			}
			
			for(int t = 10; t > i; t--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
