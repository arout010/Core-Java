import java.util.*;
class CheckPrimeFromArray
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int n=kb.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int flag=0;
			System.out.print("Enter NO."+(i+1)+" : ");
			arr[i]=kb.nextInt();
			int z=Sqrt(arr[i]);
			for(int j=2;j<=z;j++)
			{
				if(arr[i] % j == 0)
				{
					System.out.println("Nmber is not prime");
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("Number is prime..");
		}
		
	}
}