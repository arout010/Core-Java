import java.io.*;
class Thread1 extends Thread{

	public int n;
	
	public void run()
	{
		int s=0;
		for(int i=1;i<=n;i++)
		{
			s=s+i;
			try{thread.sleep(1000);}catch(InterruptedException e){}
			System.out.println("sum : "+s);
		}
		
	}

}
class Thread2 extends Thread{

	public int n;
	
		
	public void run()
	{
		int s=1;
		for(int i=2;i<=n;i++)
		{
			s=s*i;
			try{thread.sleep(1000);}catch(InterruptedException e){}
			System.out.println("fact : "+s);
		}
		
	}

}

public class Sleep
{
	public static void main(String []args)
	{
		Thread1 td = new Thread1();
		Thread2 td2 = new Thread2();
		td.n=5;
		td2.n=5;
		td.start();
		td2.start();
	}
}