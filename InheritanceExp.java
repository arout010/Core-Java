import java.util.Scanner;
class Super
{
	public int x=23;
	
}
class Sub extends Super
{
	public int x=87;
	void show()
	{
		System.out.println("Super class 'x':"+super.x);
		System.out.println("Sub class 'x':"+x);
	}
}

class InheritanceExp
{
	
	public static void main(String []args)
	{
		Sub obj=new Sub();
		Super obs=new Super();
		obj.show();
	}
}