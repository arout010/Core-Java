import java.util.*;
class exp1
{
	public static void main(String []args)
	{
		
		String s="aawaa";
		String s1=s.toUpperCase();
		char arr[]=s.toCharArray();
		System.out.println(s1);
		/*for(int i=0;i<5;i++)
		{
			arr[i]=(i+1);
		}*/
		int j=arr.length-1,k;
		LABEL:
		for(int i=0;i<1;i++)
		{
			
			for(k=0;k<10;k++)
			{
			 if(k==5)
					continue LABEL;
			/*if(arr[i]!=arr[j])
			{
				System.out.println("not pilandrome");
				j=-1;
				break;
			}
			j--;*/
			System.out.println(k);
			}
		}
		if(j!=-1)
			System.out.println(" pilandrome");
	}
}