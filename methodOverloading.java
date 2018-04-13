import java.util.Scanner;
class methodOverloading
{
	public static void addFun(int x,int y)
	{
		System.out.println("Addition of two Integer Is: "+(x+y));
	}
	public static void addFun(double x,double y)
	{
		System.out.println("Addition of two Double Is: "+(x+y));
	}
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Two Integers");
		int x=s.nextInt();
		int y=s.nextInt();
		addFun(x,y);
		System.out.println("Enter Two Double");
		double a=s.nextDouble();
		double b=s.nextDouble();
		addFun(a,b);
	}
}