class AE
{
	public static void main(String []args)
	{
		int a=10,b=0;
		try
		{
			int c=a/b;
			System.out.println("Division is : "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Out of try and catch block");
	}
}