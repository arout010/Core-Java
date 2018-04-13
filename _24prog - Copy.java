import java.util.Scanner;
class _24prog
{
	public static void main(String []args)
	{
		int a,b;
		try
		{	
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			try
			{
				System.out.println("Division of " +a+ " and " +b+ " is = "+(a/b));
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exception is: "+e);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception is: "+e);
		}
	}
}