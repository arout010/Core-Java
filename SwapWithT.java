
public class SwapWithT
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
		int t=a;
		a=b;
		b=t;
		System.out.println("Before swapping A :"+a);
		System.out.println("Before swapping B :"+b);
		}
		else
			System.out.println("Invalid choice");
	}
}