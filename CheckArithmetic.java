class CheckArithmetic
{
	public static void main(String []args)
	{
		try
		{
			int x=Integer.parseInt("akshaya");
			System.out.println(x);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
			
	}
}