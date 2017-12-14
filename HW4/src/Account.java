import java.text.DecimalFormat;
public class Account 

	{
	  
		DecimalFormat dim = new DecimalFormat("####.##");
	   private final double RATE = 0.035;  // interest rate of 3.5%

	   private int acctNumber;
	   private double balance;
	   private String name;

	   //-----------------------------------------------------------------
	   //  Sets up the account by defining its owner, account number,
	   //  and initial balance.
	   //-----------------------------------------------------------------
	   public Account (String owner, int account, double initial)
	   {
	      name = owner;
	      acctNumber = account;
	      balance = initial;
	   }

	   //-----------------------------------------------------------------
	   //  Validates the transaction, then deposits the specified amount
	   //  into the account. Returns the new balance.
	   //-----------------------------------------------------------------
	   public double deposit (double amount)
	   {
	      if (amount < 0)  // deposit value is negative
	      {
	         System.out.println ();
	         System.out.println ("Error: Deposit amount is invalid.");
	         System.out.println (acctNumber + "  " + (amount));
	      }
	      else
	         balance = balance + amount;
	      return balance;
	   }

	   //-----------------------------------------------------------------
	   //  Validates the transaction, then withdraws the specified amount
	   //  from the account. Returns the new balance.
	   //-----------------------------------------------------------------
	   public double withdraw (double amount, double fee)
	   {
	      amount += fee;

	      if (amount < 0)  // withdraw value is negative
	      {
	         System.out.println ();
	         System.out.println ("Error: Withdraw amount is invalid.");
	         System.out.println ("Account: " + acctNumber);
	         System.out.println ("Requested: " + (amount));
	      }
	      else
	         if (amount > balance)  // withdraw value exceeds balance
	         {
	            System.out.println ();
	            System.out.println ("Error: Insufficient funds.");
	            System.out.println ("Account: " + acctNumber);
	            System.out.println ("Requested: " + (amount));
	            System.out.println ("Available: " + (balance));
	         }
	         else
	            balance = balance - amount;

	      return balance;
	   }

	   //-----------------------------------------------------------------
	   //  Adds interest to the account and returns the new balance.
	   //-----------------------------------------------------------------
	   public double addInterest ()
	   {
	      balance += (balance * RATE);
	      return balance;
	   }

	   //-----------------------------------------------------------------
	   //  Returns the current balance of the account.
	   //-----------------------------------------------------------------
	   public double getBalance ()
	   {
	      return balance;
	   }

	   //-----------------------------------------------------------------
	   //  Returns the account number.
	   //-----------------------------------------------------------------
	   public int getAccountNumber ()
	   {
	      return acctNumber;
	   }

	   //-----------------------------------------------------------------
	   //  Returns a one-line description of the account as a string.
	   //-----------------------------------------------------------------
	   public String toString ()
	   {
		   DecimalFormat dim = new DecimalFormat("####.##");
	      return (acctNumber + "\n" + name + "\n" + "$" + dim.format(balance) + "\n");
	   }
	   
	  public boolean transf(double amount, double fee, Account to, Account from)
	  {
		 if (from.balance + fee < amount || amount < 0)
		return false;
		 
		 from.withdraw(amount, fee);
		 to.deposit(amount);
		 return true;
		  
	  }
	  
	}

