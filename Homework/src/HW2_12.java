import java.text.DecimalFormat;
public class HW2_12 {
			
		public static void main(String[] args){
			DecimalFormat dim = new DecimalFormat("#.###");
			int q = 9;
			int d = 8;
			int n = 5;
			int p = 3;
			int totalCoins = 25;
			
			System.out.println("Total amount of coins is: " + totalCoins);
			
			int qVal = 25;
			int dVal = 10;
			int nVal = 5;
			int pVal = 1;
			
			int qCon = qVal*q;
			int dCon = dVal*d;
			int nCon = nVal*n;
			int pCon = pVal*p;
			
			double totalMoney = qCon+dCon+nCon+pCon;
			
			
			System.out.println("Total amount of money is: " + dim.format(totalMoney));
			
			double moneyCon = (totalMoney)/100;
			
			System.out.println("Total amount of money converted: $" + dim.format(moneyCon));
			
		}
}
