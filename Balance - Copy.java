class Balance
{
	public static void main(String []args)
	{
		int balance=5000;
		int withdraw=6000;
		try
		{
			if(balance < withdraw)
				throw new ArithmeticException("Insufficent balance");
			balance=balance-withdraw;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
			System.out.println("Remaining balance is: "+balance);
	}
}