import java.util.Scanner;
class MultipleCatch
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1=s.nextInt();
		System.out.println("Enter ndst number");
		int num2=s.nextInt();
		int array[]=new int[3];
		int num3;
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter "+(i+1)+" number: ");
			array[i]=s.nextInt();
		}
		try
		{
			num3=num1/num2;
			int x=array[8];
			System.out.println("Divide is: "+num3);
			System.out.println("array element  is:"+x);
		}
		/**catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}**/
		finally
		{
			System.out.println("inside finally block");
		}
		
	}
}