class Throw
{
	static void check(int a,int b)
	{
		if(b<=0)
		{
			throw new ArithmeticException("please Enter an integer Except ZERO");
		}
		else
		{
			System.out.println("Division is: "+(a/b));
		}
			
	}
	
	public static void main(String []args)
	{
		System.out.println("Welcome to the User defined Exception section");
		int a=10,b=0;
		check(a,b);
	}
}
	