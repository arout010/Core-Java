/****LIBRARY MANAGEMENT SYSTEM*****/
import java.util.Scanner;
import java.io.*;
class book implements serializable
{
	Scanner Sc=new Scanner(System.in);
	String BookName;
	String BookId;
	String Authorname;
	int Price;
	void addbook()
	{
		System.out.print("\nEnter Book name: ");
		BookName = Sc.next();
		System.out.print("\nEnter Book Id: ");
		BookId = Sc.next();
		System.out.print("\nEnter Athor name: ");
		Authorname = Sc.next();
		System.out.print("\nEnter Price: ");
		Price = Sc.nextInt();
	}
	void showbook()
	{
		if(this.BookName == null || this.BookId == null)
		{
			System.out.print("\nNo Record found\n");
		}
		else
		{
			System.out.print("\nBook name: "+this.BookName);
			System.out.print("\nBook Id: "+this.BookId);
			System.out.print("\nBook Author Nmae: "+this.Authorname);
			System.out.print("\nBook Price: "+this.Price);
		}
	}
	void modifybook()
	{
		System.out.print("\nEnter Book name: ");
		BookName = Sc.next();
		System.out.print("\nEnter Athor name: ");
		Authorname = Sc.next();
		System.out.print("\nEnter Price: ");
		Price = Sc.nextInt();
	}
}
public class Myproject
{
	public static void main(String []args)
	{
		//book b[] = new book[10];
		book b1 = new book();
		//int index=-1;
		Scanner s=new Scanner(System.in);
		while(true)
		{
				System.out.println("\n1) AddBook\n2) DeleteBook\n3) SearchBook \n4) Modify book\n5) Show book\n6) Return");
				System.out.print("Enter Choice: ");
				int ch=s.nextInt();
				if(ch==1)
				{
					System.out.print("Addbook");
					b1.addbook();
					try{
					FileOutputStream fos = new FileOutputStream("mybean.ser");
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(mb);
					oos.close();}catch(Exception e){}
				}
				if(ch==2)
				{
					System.out.print("deletebook");
					if(b1.BookId != null)
						b1=null;
					else
						System.out.print("\nNo Record found to delete\n");
				}

				if(ch==3)
				{
					System.out.print("searchbook");
					

				}
				if(ch==4)
				{
					System.out.print("modify book");
					if(b1 != null)
						b1.modifybook();
					else
						System.out.print("\nNo Record found\n");
				}
				if(ch==5)
				{
					System.out.print("Show book");
					if(b1 != null)
						b1.showbook();
					else
						System.out.print("\nNo Record found\n");
				}

				if(ch==6)
				{
					break;
				}

			}

	}
}
