import java.io.*;
import java.util.Scanner;
class Publisher
{
	public String p_name="Akshaya";
	public int p_id=10;
	
}
class Book extends Publisher
{
	 String b_name;
	 int b_id;
	public void getData(String name,int id)
	{
		b_name=name;
		b_id=id;
	}
	public void showData()
	{
		System.out.println("Book name: "+b_name);
		System.out.println("Book id: "+b_id);
		System.out.println("Publisher name: "+super.p_name);
		System.out.println("Publisher id: "+super.p_id);
	}
	
}
public class _26
{
	public static void main(String[] args)
	{
		Book b = new Book();
		Publisher p = new Publisher();
		b.getData("java",1);
		b.showData();
	}
}

	