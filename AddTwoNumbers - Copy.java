public class AddTwoNumbers
{
	public static void main(String []args)
	{
		if(args.length==4)
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			int d=Integer.parseInt(args[3]);
			int e=a+b+c+d;
			System.out.println("addition of 4 number  is=" +e);
		}
		else
			System.out.print("Invalid number of arguements");
	}
}