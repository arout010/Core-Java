import java.util.Scanner;
class Grade
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter total number of Subjects:");
		int n=s.nextInt();
		int a[]=new int[n];
		int fail[]=new int[n];
		int sum=0,avg,c=0;
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter marks of Sub"+(i+1)+" : ");
			a[i]=s.nextInt();
			if(a[i] < 35)
			{
				fail[i]=(i+1);
				c++;
			}
			sum=sum+a[i];
		}
		avg=sum/n;
		if(c>0)
		{
			System.out.println("You are failed in following subjects:->");
			for(int i=0;i<c;i++)
			{
				System.out.println("sub "+fail[i]);
			}
		}
		if(avg >= 35)
			System.out.println("In aggregate are passed");
		else
			System.out.println("In aggregate are failed");
	}
}