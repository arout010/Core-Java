import java.util.Scanner;
class thread extends Thread
{
	public void run()
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int sum = 0;
		for(int i=0;i<n;i++)		
		{
			sum=sum+i;
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e){}
			System.out.println("Sum is:"+sum);
		}	
	}
	public static void main(String []args)
	{
		thread t1= new thread();
		t1.start();
	}
	
}