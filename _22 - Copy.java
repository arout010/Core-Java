class Shape
{
	double calclate()
	{
		return 0;
	}
}
class Rect extends Shape
{
	double calclate( dou)
	{
		return 0;
	}
}
class Circle extends Shape
{
	void use()
	{
		System.out.println("Sleeping");
	} 
}
class Overriding
{
	public static void main(String []args)
	{
		Chair ch = new Chair();
		Bed bd = new Bed();
		Table t = new Table();
		System.out.println("Use of Chair is: ");
		ch.use();
		System.out.println("Use of Bed is: ");
		bd.use();
		System.out.println("Use of Table is: ");
		t.use();
	}
}