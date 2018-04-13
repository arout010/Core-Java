//import java.Exception;
class thread3 extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			Thread.sleep(1000)throws InterrptedException;
			System.out.println(Thread.crrentThread().getName());
		}
	}
	public static void main(String []args)
	{
		thread3 t1 =new thread3();
		thread3 t2 =new thread3();
		thread3 t3 =new thread3();
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3-d");
		t2.setDeamon(true);
		t1.start();
		t2.start();
		t3.start();
	}		
		
}
