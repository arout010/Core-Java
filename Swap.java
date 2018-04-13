
public class Swap
{
	//static int a=10,b=20;
	public static void main(String []args)
	{
		if(args.length==2)
		{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("Before swapping A :"+a);
		System.out.println("Before swapping B:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Before swapping A :"+a);
		System.out.println("Before swapping B :"+b);
		}
		else
			System.out.println("Invalid choice");
	}
}