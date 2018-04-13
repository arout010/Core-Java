import java.util.Scanner;
class Stack
{
	int arr[]=new int[10];
	int top=-1;
	void push(int x)
	{
		if(top >= 2)
		{
			System.out.println("\nStack is Full....\n\tCan't Insert....\n ");
		}
		else
		{
			arr[++top] = x;
			System.out.println("Entered Element is: "+arr[top]);
		}
		
	}
	void pop()
	{
		if(top == -1)
		{
			System.out.println("\nStack is Empty canot poped!!!!!!!!!!!\n ");
		}
		else
		{
			System.out.println("Poped Element is : "+arr[top]);
			top=top-1;
		}
	}
	void peep()
	{
		if(top == -1)
		{
			System.out.println("\nStack is Empty....\n\tCan't Display....\n ");
		}
		else
		{
			System.out.println("\nStack Elements are:  ");
			for(int i=0;i<=top;i++)
			{
				System.out.print("\t"+arr[i]);
			}
		}
	}
}
public class _15Stack
{
	public static void main(String []args)
	{
		Stack s = new Stack();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("\n1.Push\n2.Pop\n3.peep\n4.Exit\n\n\n\tEnter Your choice: ");
			int choice=sc.nextInt();
			if(choice == 1)
			{
				System.out.print("Enter An Element : ");
				int x=sc.nextInt();
				s.push(x);
			}
			else if(choice==2)
			{
				System.out.print("\n\t\tPop\n");
				s.pop();
			}
			else if(choice==3)
			{
				System.out.print("\n\t\tPeep\n");
				s.peep();
			}
			else if(choice==4)
			{
				System.out.println("Exit");
				return;
			}
			else
				System.out.println("Invalid choice");
				
		}
		
	}
	
}
