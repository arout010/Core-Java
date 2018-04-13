interface i
{
void show();
 
}
interface j
{
  void show();
}

public class Interface1 implements i,j
{
	public void show()
	{
		System.out.println("show");
	}
	public static void main(String args[])
	{
		Interface1 obj=new Interface1();
		obj.show();
	}
}