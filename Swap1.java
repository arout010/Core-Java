
public class Swap1
{
	static int a=10,b=20;
	public static void main(String []args)
	{
	
		System.out.println("Before swapping A :"+a);
		System.out.println("Before swapping B:"+b);
		a=(a+b);
		b=a-b;
		a=a-b;
		System.out.println("Before swapping A :"+a);
		System.out.println("Before swapping B :"+b);
	}
}