class Pilandrome
{
	public static void main(String []args)
	{
		int n=Integer.parseInt("121");
		int t=n;
		int s=0,p,r;
		while(n>0)
		{
			r=n % 10;
			s=(s*10) + r;
			n=n/10;
		}
		if(t==s)
			System.out.println("Number is pilemdrome");
		else 
			System.out.println("Number is Not pilemdrome");
	}
}
			