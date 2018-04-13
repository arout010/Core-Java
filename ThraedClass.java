class ThraedClass extends Thread{
	public void run()
	{
		System.out.println("Thread is running throw Extending the thread class.....");
	}
	public static void main(String []args)
	{
		ThraedClass t1= new ThraedClass();
		t1.start();
	}
}
	
