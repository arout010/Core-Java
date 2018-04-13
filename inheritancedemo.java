class parent
{
	String name="Akshaya";
	void f1()
	{
		System.out.println("Inside parent class");
	}
}
class child extends parent
{
	void f2()
	{
		System.out.println("Inside child class"+super.name);
	}
}
public class inheritancedemo
{
	public static void main(String []args)
	{
		child p = new child();
		p.f1();
	}
}