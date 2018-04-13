
public class Factorial
{
	//static int a=10,b=20;
	public static void main(String []args)
	{
		if(args.length==1)
		{
		int f=1;
		int a=Integer.parseInt(args[0]);
		for(int i=a;i>=1;i--)
		{
			f=f*i;
		}
		System.out.println("factroial of " +a+ " is:"+f);
		}
		else
			System.out.println("Invalid choice");
	}
}