import java.util.Scanner;
class Stack
{
	int arr[]=new int[10];
	void push(int x);
	int pop();
	void peep();
}
class _15.Stack
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
				System.out.println("Push");
			}
			else if(choice==2)
			{
				System.out.println("Pop");
			}
			else if(choice==3)
			{
				System.out.println("Peep");
			}
			else if(ch==4)
			{
				System.out.println("Exit");
				return;
			}
			else
				System.out.println("Invalid choice");
				
		}
		
	}
	
}
