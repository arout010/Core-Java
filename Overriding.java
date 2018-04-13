class Ferniture
{
	void use()
	{
		System.out.println("Use of fernitre is: ");
	}
}
class Chair extends Ferniture
{
	void use()
	{
		System.out.println("Sitting");
	} 
}
class Bed extends Ferniture
{
	void use()
	{
		System.out.println("Sleeping");
	} 
}
class Table extends Ferniture
{
	void use()
	{
		System.out.println("Stdying");
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