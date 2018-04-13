import java.util.Scanner;
public class AddNNumbers
{
	public static void main(String []arge)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=kb.nextInt();
		int s=0;
		for(int i=1;i<=n;i++)
		{
			s=s+i;
		}
		System.out.print( "addition of "+n+" numbers id: "+s);
	}
}