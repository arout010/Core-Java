import java.util.Scanner;
public class Array1
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array:\n");
		int n=s.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter no: ");
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Number "+(i+1)+" : "+a[i]);
		}
		
		
	}
}