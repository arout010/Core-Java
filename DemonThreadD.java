class DemonThreadD extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			if(Thread.currentThread().isDaemon())
				System.out.println("Daemon Thraed is running");
			else
				System.out.println("Normal Thraed is running");
			try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
		}
	}
	public static void main(String []args)
	{
		DemonThreadD d1=new DemonThreadD();
		DemonThreadD d2=new DemonThreadD();
		d1.setDaemon(true);
		d2.start();
		d1.start();
	}
}