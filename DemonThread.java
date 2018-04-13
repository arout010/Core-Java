public class DemonThread extends Thread
{
	public void run()
	{
		for(int i=1;i<6;i++)
		{
		try{Thread.sleep(1000);}
			catch(InterruptedException e)
			{
			System.out.println(e);}
			System.out.println("Running......" +isDaemon()+i);	
		}
	}
		public DemonThread()
		{
			setDaemon(false);
		}
	
	//}
	public static void main(String[] args)
	{
		DemonThread d1=new DemonThread();
		DemonThread d2=new DemonThread();
		DemonThread d3=new DemonThread();
		d1.start();
		d2.start();
		d3.start();
	}
}