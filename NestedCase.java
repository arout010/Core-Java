public class NestedCase
{
	public static void main(String []args)
	{
		int a=1;
		switch(a)
		{
			case 1:
			int b=2;
			switch(b)
			{
				case 1:
					System.out.println("inside nested case 1");break;
				case 2:
					System.out.println("inside nested case 2");break;
				default:
					System.out.println("inside nested default case ");break;
			}
			System.out.println("inside case 1");break;
			case 2:
			System.out.println("inside case 2");break;
			default:
			System.out.println("inside default case ");break;
		}
	}
}	