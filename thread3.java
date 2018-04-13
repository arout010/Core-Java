//import java.Exception;
class thread3 extends Thread
{
	public void run()
	{
		for(int i=0;i<2;i++)
		{
			try{Thread.sleep(3000);}catch(InterruptedException e){}
			if(Thread.currentThread().isDaemon())
				System.out.println("daemon thread : "+Thread.currentThread().getName()+" priority: "+Thread.currentThread().getPriority());
			else
				System.out.println(Thread.currentThread().getName()+"priority: "+Thread.currentThread().getPriority());
			//System.out.println();
			System.out.println(i);
		}
	}
	public static void main(String []args)
	{
		thread3 t1 =new thread3();
		thread3 t2 =new thread3();
		thread3 t3 =new thread3();
		t1.setName("d-t1");
		//t1.setPriority(Thread.MAX_PRIORITY);
		t2.setName("t2");
		//t3.setPriority(Thread.MIN_PRIORITY);
		t3.setName("t3");
		try{t1.join();}catch(InterruptedException e){}
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}		
		
}
