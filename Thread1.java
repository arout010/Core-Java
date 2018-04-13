class Thread1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<6;i++)
		{
		try{Thread.sleep(1000);}
			catch(InterruptedException e)
			{
			System.out.println(e);}
			System.out.println("Running......"+i);
			
		}
		
	}
	public static void main(String []args)
	{
		Thread1 t1=new Thread1();
		Thread t=new Thread(t1);
		Thread t2=new Thread(t1);
		Thread t3=new Thread(t1);
		t.start();
		t2.start();
		t3.start();
	}
}
	
		