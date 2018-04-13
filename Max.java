
public class Max
{
	public static void main(String []args)
	{
		
		int a[]={3,4,5,7,2};
		int max=a[0],min=a[0],sum=0;
		for(int i=0;i<5;i++)
		{
			if(max<a[i])
				max=a[i];
			else if(min>a[i])
				min=a[i];
			sum=sum+a[i];
		}
		int avg=sum/5;
		System.out.println("max is: "+max+" \tmin is: "+min);
		System.out.println("sum is: "+sum);
		System.out.println("avarage is: "+avg);
	}

}