public class Exception
{
	public static void main(String []args)
	{
		int x=10,y=0;
		try
		{
			int z=x/y;
			System.out.println("Division is:"+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("addition  is:"+(x+y));
	}
}