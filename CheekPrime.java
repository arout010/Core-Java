
	public class CheekPrime
	{
		public static void main(String []args)
		{
			
			if(args.length==1)
			{
				int n=Integer.parseInt(args[0]);
				int flag=0;
				for(int i=2;i<n/2;i++)
				{
					if(n % i == 0)
					{
						flag=1;
						System.out.println("Number is not prime ");
						break;
					}
				}
				if(flag==0)
					System.out.println("Number is prime ");
			}
		}
	}