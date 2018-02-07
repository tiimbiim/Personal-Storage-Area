
public class pascalTriangle {
	
	static int [] pascalT = new int[100];
	
	public static void pascalTCaller(int triRow, int[]pascalT)
	{
		
		int[] temp = new int[100];
		
		if(triRow == 1)
			pascalT[0] = 1;
		
		if(triRow == 2) {
			
			pascalT[0] = 1;
			pascalT[1] = 1;
		}
		
		else
		{
			
			pascalTCaller(triRow-1, temp);
			pascalT[0] = 1;
			
			for(int f = 0; f < triRow-2; f++)
				pascalT[f+1] = temp[f] + temp[f+1];
			
			pascalT[triRow-1] = 1;
			
		}
		
	}

}
