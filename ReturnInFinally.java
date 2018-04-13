//import java.util.Scanner;
class ReturnInFinally
{
	static void getdata()
	{
		int a=10;
		int b=0;
		try
		{
			int c=a/b;
			//return 1;
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("Inside catch block");
			//return 2;
		}
		
		///*
		finally
		{
			System.out.println("Inside finally block");		
			//return 3;
		}	
		//*/	
			
	}
	public static void main(String []args)
	{
		//int x=
		getdata();
		System.out.println("The retuened value is: ");
	}
}