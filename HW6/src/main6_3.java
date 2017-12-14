
public class main6_3
{
	
	public static void main(String[] args)
	{
		int [] test = {1,3,2,643,5,4,6,7,9};
		int [] test2 = {4,2,34,2,164,32,42,64,12};
		hw6_3 hw = new hw6_3();
		hw.selectionSort(test);
		
		hw.insertionSort(test2);
		for(int i = 0; i <test.length; i++)
			System.out.println(test[i] + "\t" + test2[i]);
	}
}
