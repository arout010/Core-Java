class multi1 extends Thread
{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String []args)
	{
		multi1 t1 = new multi1();
		t1.start();
		t1.setName("Akshaya");
		t1.setPriority(1);
		System.out.println("Name of the thread: "+t1.getName());
		System.out.println("Priority of the thread: "+t1.getPriority());
	}
}	