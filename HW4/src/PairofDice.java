import java.util.Random;
public class PairofDice {

	public int die ()
	{
		
		int sum = 0;
		for(int i = 0; i < 1000; i++)
		{
			Random rim = new Random();
			int roll = rim.nextInt(6)+1;
			int roll2 =  rim.nextInt(6)+1;
			if(roll == 6 && roll2 ==6)
				sum++;
		}
		System.out.println("The total is " + sum);
		return sum;
	}
}
