class prime
{
	public static void main(String args[])
	{
		
		if(args.length==1)
		{
			int flag=0;
			int n=Integer.parseInt(args[0]);
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
				    flag=1;
					break;
				}
			}
			if(flag!=1)
				System.out.println("No is prime");
			else
				System.out.println("No is Not prime");
		}
		else
			System.out.println("please provide only one integer number");
	}
}