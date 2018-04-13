class Multi implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
Multi t1=new Multi();
Thread t=new Thread(t1);  
t.start();  
 }  
}  