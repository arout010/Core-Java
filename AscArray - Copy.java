import java.util.Scanner;
public class AscArray
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter total numbers: ");
		int n=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter number"+(i+1)+" : ");
			a[i]=kb.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i] < a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Number "+(i+1)+": "+a[i]);

		}
	}
}