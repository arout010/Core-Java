import java.util.Scanner;
public class TotalNoOfPrimeNumbers
{
	public static void main(String []args)
	{
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		int n1=s1.nextInt();
		int n2=s2.nextInt();
		System.out.print("all prime numbers are: ");
		for(int i=n1;i<=n2;i++)
		{
			int flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i %j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.print("\t"+i);
		}
	}
}