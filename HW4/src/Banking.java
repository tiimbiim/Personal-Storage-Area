
public class Banking {

	public static void main(String []args)
	{
		Account tim = new Account("Tim Vu", 89961, 1023.33);
		Account bim = new Account("Bolivia Cradley", 74328, 12.00);
		
		System.out.println(tim);
		System.out.println(bim);
		
		tim.transf(100.00, 9, bim, tim);
		
		System.out.println(tim);
		System.out.println(bim);
	}
}
	

